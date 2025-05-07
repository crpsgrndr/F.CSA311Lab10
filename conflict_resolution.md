# Conflict Шийдвэрлэлт

## Conflict-ийн Дэлгэрэнгүй

`hotfix/v1.0.1` салбарыг `develop` руу нэгтгэх үед `src/main/java/lab15/sict/must/edu/mn/Multiplication.java` файл дээр merge conflict үүссэн. Энэ нь хоёр салбар тус бүр дээр өөр өөр comment (`// Developed by Bat`, `// Hotfix by Bat`) нэмсэнээс үүдэлтэй.

## Шийдвэрлэлтийн Алхмууд

1. `develop` салбар руу PR үүсгэх үед conflict гарсан.
2. GitHub дээр `Resolve conflicts` товчийг дарж файлыг нээсэн.
3. Доорх зөрчилтэй кодыг харсан:

   ```java
   <<<<<<< hotfix/v1.0.1
   // Hotfix by Bat
   =======
   // Developed by Bat
   >>>>>>> develop
