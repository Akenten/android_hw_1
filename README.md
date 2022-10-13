## Домашнее задание по андроиду 1.

на стартовой странице доступны 2 кнопки: "Go" и "загуглить"
при нажатии на кнопку "Go" срабатывает следующий код:

```Java
 activitybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(myintent);

            }
        });

```

на второй странице расположено поле для ввода текста. 
при вводе в него текста и нажатии на кнопку "save" сработает следующий блок кода:

```Java
  saveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity2.this, MainActivity.class);
                String s = text.getText().toString();
                myintent.putExtra(String.valueOf("key"), s);
                startActivity(myintent);
            }
        });
```

при переходе на первое Activity введенная строка будет получена и отображена на TextView:

```Java
  Intent received = getIntent();
  String str = received.getStringExtra("key");
  recivedText.setText(str);
 ```
 
 При нажатии на кнопку "загуглить" полученный текст из второго Activity и отображенный в первом будет преобразован в поисковой запрос в браузере. 
 
 ```Java
  searchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, str);
                startActivity(intent);
                }

        });
 ```
