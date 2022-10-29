Задача поиска экстремума функции нередко ставит в тупик даже самых заядлых математиков. Но не всегда нам нужен точный математический ответ.
В таком случае можно воспользоваться алгоритмами оптимизации, которые находятся [здесь](./src/minimizer/algorithms). При создании объекта класса Minimizer
передаём в конструктор функцию, которую мы хотим минимизировать (доступные функции лежат [здесь](./src/minimizer/functions)).
Для минимизации используем метод Minimizer.findMinimum(), которому нужно передать выбранный алгоритм.

Пример:

Допустим, мы хотим найти минимум функции (MultimodalFunction3) f(x) = sin(sin(sin(sin(x)))). И применить при этом алгоритм параболы (ParabolaAlgorithm).
Для этого определимся с границами поиска (a и b). И параметром точности eps.
```java
Function function = new MultimodalFunction3();
a = 3.2;
b = 5.9;
eps = 0.0001;
Minimizer minimizer = new Minimizer(a, b, eps, function);
System.out.println(minimizer.findMinimum(new ParabolaAlgorithm()));
```

### Здесь можно почитать более подробную информацию:
[Об алгоритмах](./src/minimizer/algorithms/README.md) \
[О функциях](./src/minimizer/functions/README.md)
