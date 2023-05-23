# Spring Boot Multi Module Nedir?

![image](https://github.com/MustafaFindik24/Spring-Boot-Modules/assets/91599453/2472afc7-af86-45f4-82d9-295e104d222d)

Spring Boot da projenin geliştirilmesini ve yönetilmesini kolaylaştıran bir yazılım geliştirme çeşididir. Proje yönetim araçları üzerinden (maven, gradle vb.) modüllerin birbirleri arasında entegrasyon sağlanır. Bu şekilde geliştirme süreçleri hızlanır, projenin ölçeklendirilmesi kolaylaşır ve yeni özelliklerin eklenmesi daha hızlı ve daha modüler hale gelmiş olur.

# Spring Boot Multi Module Proje Örneği

![image](https://github.com/MustafaFindik24/Spring-Boot-Modules/assets/91599453/a349c9cc-9219-43d6-9de2-52de2b04479e)

Bir parent proje oluşturulur ve pom.xml dosyasının içerisinde projenin parent olduğu belirtilir. 

![image](https://github.com/MustafaFindik24/Spring-Boot-Modules/assets/91599453/aed95e76-7407-40e6-ae2d-204df98ae32f)

Eğer bir modül diğer bir modülün içerisinde kullanılacaksa ilgili modülün pom.xml dosyasına erişilip modül dependency olarak eklenir.

