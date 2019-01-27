# TableGenerator
### 使い方
二次元配列でデータを渡すとリストが返却されるので、それをコンソールに出力します。
```Java
List<String[]> list = new ArrayList<>();
// ヘッダ
list.add(new String[]{"Name", "Age", "Email", "Job"});
// データ
list.add(new String[]{"Kaneda", "17", "akira@gmail.com", "engineer"});
list.add(new String[]{"Yamagata", "28", "takashi@gmail.com", "programer"});
list.add(new String[]{"Kai", "9", "masaru@gmail.com", "designer"});
String[][] data = list.toArray(new String[0][]);

TableGenerator.generate(data).forEach(System.out::println);
```

### 出力結果
    +----------+-----+-------------------+-----------+
    | Name     | Age | Email             | Job       |
    +----------+-----+-------------------+-----------+
    | Kaneda   | 17  | akira@gmail.com   | engineer  |
    | Yamagata | 28  | takashi@gmail.com | programer |
    | Kai      | 9   | masaru@gmail.com  | designer  |
    +----------+-----+-------------------+-----------+