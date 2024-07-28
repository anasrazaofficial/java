# java

## PRIMITIVE TYPES

Default data types provided by Java.

- int
- char
- boolean
- long-- jb integer k size bara ho
- float-- point wale number
- double-- jb float k size bara ho

## NON-PRIMITIVE TYPES

Non-primitive types are created by the programmer and is not defined by Java.There are two types:

- Wrapper classes: A way to use primitive data types as objects.
- Custom data type: Data types created by the developers. Consists of Behaviour and attribute.

## String

The storage of string in heap is known as "string constant pool".
>Note: [Important link](https://www.javatpoint.com/java-string)

### Method 1

It stores in string constant pool in heap. Using String literal. new memory allocate nhi hoti agr same value hi 2 variables ko do.

Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool. For example:

```Java
  String s1="Welcome";  
  String s2="Welcome";//It doesn't create a new instance ---!>
```
  
Why Java uses the concept of String literal?
To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).

### Method 2

It stores in heap area. Using new keyword.i.e. `String s = new String("Anas");`

To convert any any string to characters we use `tocahrArray()`.

### Q) Why Strings are immutable?

A)Immutable k mtlb hota h non changeable. Jb hm aik value string ko assign krte hn to wo constant pool ma save hojati h lkin jb dubara us variable ko change krte hn to aik nai memory asign nhi hoti blke whi change ho k nai value ajati h. Jo shi tarika nhi h kyunke.i.e,

```JAVA
 String s1=Hello;  String Constant Pool= Hello
 String s2= s1 + World; String Constant Pool = HelloWorld
```

## Array

If we need to store more than one value in one variable, we use array.i.e.

```JAVA
1) int[] arr = new int[3];
arr[0] = 97
arr[1] = 123
arr[2] = 14
```

2- `int[] arr={97,123,14};`
  
### 2d-Array

```JAVA
1) int[][] arr = new int[1][1];
arr[0][0] = 3
arr[0][1] = 5
arr[1][0] = 1
arr[1][1] = 7
```

2- `int[][] arr={{3,5},{1,7}};`

## Comparable and Comparator

### Comparable

- We only have to implement Comparable in class.
- We then have to override compareTo method to tell the attribute by which we have to compare the values.
- It only compares the object by one attribute.

### Comparator

- We first have to make a class and then implement Comparator in class.
- We then have to override compareTo method to tell the attribute by which we have to compare the values.
- It compares the object by more than one attribute.

## Static

- We can access any static-variable or static-method thorugh the name of class. We use static because if we think that we need to access that variable or method in several classes.
- Jb bhi static variable ki value change hogi wo sary objects k lie hogi.
- Main method is lie static hota h kyuke jb main method chlta h to us k object nhi bnta. yani memory effeciency k lie main method static hota h.
- Jb bhi koi classs initialize hogi to constructor sa pehle static block chlega.

### Q) Why use static?

A) Jb hme lge k ksi attribute y method ko mukhtlif classes ma use krna ho.

### Restrictions of Static

- Kisi bhi static method ma non-static method y non-static variable directly call nhi krskte lkin object bna k call krskte hn.
- this and super not allowed as well.

## OOP

### 1) Inheritance

Is ma child parent k relationship hota jis k zrie child apne parent k sary attributes aur behaviours ko access kr skta h

- Q)When to use Inheritance?\
A)When we have group of classes belonging to same category.

- Q) Why multiple inheritance is not supported in java?\
A)Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.

#### Aggregation

is ma apni data types bnate hn.

### 2) Encapsulation

Apny attributes ko 'private' keyword k zarie restrict krna jis k zarie aapke attributes ko koi access nhi krskta. Fully  encapsulatde classes are "POJO class" or "Java Bean".

- Q) why do we use Encapsulation?\
A) Data hiding and control over data

### 3) Polymorphism

Aik kam krne k different tarike

#### 1) Overloading / Compile time polymorphism / Static polymorphism

Multiple methods bna skte hn. jo no and types of args p depend krte hn

#### 2) Overriding / Run time polymorphism / Dynamic polymorphism

Parent k methods ko overide kr skta h child.

#### 3) upcasting

Parent k reference de ke child k class.

### 4) Abstraction

Hiding the implementation. Class of set of rule.\
Parent ma method bnate us ma abstract keyword k zrie us method ko abstract kr dete hn aur uske child per lazmi hota h k wo usko method ko bnae

#### Interface

Same as abstraction but interface only contains abstract methods.

## Collection

### Lists

#### - Array List

It is found in Java util package.Is list ma add aur get krna asan h lkin remove aur insert krna mushkil h. yani ho to jaega lkin preformance issue ata h jo k shi tarika nhi h. kyuke jb arraylist sa value ko remove kro to wo jgh khaali hojati h aur peeche k sary index ki values jump kr ke aagey ati hn. Isi trh insert krne ma values jump kr ke aagey jati hn.Properties:

- Contains duplicate elements.
- Maintains insertion order.
- can get easily
- In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
- We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases. For example:

```JAVA
 ArrayList<int> al = ArrayList<int>(); //does not work
 ArrayList<Integer> al = new ArrayList<Integer>(); //works fine
```

- Java ArrayList gets initialized by the size. The size is dynamic in the array list, which varies according to the elements getting added or removed from the list.

#### - Linked List(DVD) = Remove/Delete and insert =

Jb is ma get krte hn to y list shuru sa chlti h aur phir us index p phnchti h jo hm na get kia tha. Aur is ma remove aur insert krna asan hota h.

Some common methods of List:

- .add() = array ma values add krta h. For e.g:
`arr.add("Anas")`
- .get() = array ma given index sa value get krta h. For e.g:
`arr.get(4) / arr.get("Anas")`
- .size()  = array k size btata h
`arr.size()`
- .startswith() = check krta h k konsa kon kon sa elements given input alphabet sa start ho rhe hn
- sort method = array ko sort krta h ascending order ma. Syntax:

```JAVA
Collections.sort(arr);
sout(arr);
```

- `Arrays.asList(a,b,c,d,...);` = this method gets objects in arguments and creates a list of these objects.

### Set

It is a type of array which removes duplicate elements. Primitive types not allowed. It doesn't allow duplicate classes only when we override compareTo and hascode method. Because we have to pass the attributes through which we want to compare classes. Types:

#### - Hashset

It does not maintain the insertion oreder.i.e:
input --> `arr = as,qw,rt,ui,op;`
output -->  `arr = qw,op,as,ui,rt;`

#### - LinkedHashSet

It gives the result in insertion order.
input --> `arr = as,qw,rt,ui,op;`
output -->  `arr = as,qw,rt,ui,op;`

#### - Treeset

It sorts the set.
input --> `arr = as,qw,rt,ui,op;`
output -->  `arr = as,op,qw,rt,ui;`
But we have to implement comparable

### Stack

LIFO(Last In First Out) mechanism
When we data of in reverse order we use stack.

Some common methods of stack=

- `.push()` = adds values
- `.pop()` = removes the last value
- `.peek()` = checks the last value

### Queue

FIFO(First In First Out) mechanism

Some common methods of queue =

- `.add()` = adds values
- `.poll()` = removes the first value
- `.peek()` = checks the first value

### Map

It is use at the time of gropuing.
(Map Array K name).get() = key le k value deta h
(Map Array K name).put() = Add
How to print through loop:

```JAVA
 for(Map.Entry<Data type, Data type> variable: (Map Array K name).entrySet()){
  sout(m.getKey());
  sout(m.getValue());
 }
```

## Generic

Aise methods jis ma koi bhi data type pas kr skte hn. Yani aik hi method ma koi bhi data type use hoskti h. Aur data type variable sa denote krte hn. Lkin jo type di jati h whi return krta h. Mostly used variables are:

- T: Type
- E: Element
- K: Key
- V: Value
In variables k ilawa bhi doosre variables use hoskte hn.

### Q) When/Why do we use Generics?\

A) When there is probability of using the same code or method for different types, we use generics.

### Advantages

- Type safety = agr kisi normal list ma koi doosri data type dalte hn to wo run time p error deta h. Lkin agr yhi kam generics k through kro to compile time p hi error de dega.

- Type casting is not required:

```JAVA
 List list = new ArrayList();  
 list.add("hello");
 String s = (String) list.get(0); //typecasting
```

- After Generics, we don't need to typecast the object.

```JAVA
 List<String> list = new ArrayList<String>();
 list.add("hello");
 String s = list.get(0);
```

- Compile time checking: Agr apne compile time p apni data type btadi. Aur uska bad koi doosri data type daali to wo compile time hi error de dega.

## Exception Handling

Abnormal activity of the code. Types of Exception:

### Unchecked exceptions/run time Exception =

Aapko force nhi kia jata k lazmi handle kro lkin agr handle naa kro to code terminate hojata h.

#### (i) Types of Unchecked exception

1. NullPointer exception: jb kisi ki value ma null ho aur us p koi function call ho to y exception aaegi
2. Number format exception: agr koi value string ma ho aur use parseInt k zrie us ki data type Integer ma krni ho lkin wo value non-number ho to y exception aati h
3. Arithmetic exception: Divide by zero
4. Array index of bound exception: Jb koi reqiured index us array ma ho hi nhi

#### How to handle

 Possibilites to get any exception and we want that either any exception occurs or not, the code should be continued, we use `try{}catch()`.i.e.

```JAVA
try {
 .......
} catch(Exception e) {
 e.printStackTrace();
}
```

### Checked Exception / Compiletime Exception

Compulsory to solve exception. when contacting with third party. to resolve checked exception we use "throws" keyword.
For e.g: File not found, connecting to sql or database

- Throws: Is sa y hota h k method khta h k jo exception aaegi use hm solve nhi krenge blke us method ko jo call kr rha h wo use solve krega. y compulsory hota h checked exception ma.

- Throw: y hm lgate hn jo k compulsory nhi hota

- Finally= chahe exception aae y nhi finally chlega.i.e.

```JAVA
try {
 ...
} catch() {
 ...
} finally{
 ...
 }
```

- If exception doesnot occur = try and finally run
- If exception occurs = try, catch and finally run

## Equals

A method which compares two strings is called ".equals() method. Two important methods provided by the Object class for comparing objects.

### `equals()` method

- `equals()` is considered as a method in Java.
- It is used to compare the actual content of the object.
- We can use the equals method with non-primitives and objects.
- The `equals()` method can compare conflicting objects utilizing the `equals()` method and returns “false”.
- `equals()` method can be overridden.

### == Operator

- == is considered an operator in Java.
- It is majorly used to compare the reference values(memory address) and objects.
- We can use the == operator with primitives.
- The == operator can’t compare conflicting objects, so at that time the compiler surrenders the compile-time error.
- It can't be overridden.

#### Q) why do we override equals method?

A) Kyunke hme objects ko btana prhta h k kin attributes k hwale sa compare krna h

## Compareto() Method

This method compares two strings. i.e, `String1.compareTo(String2)`

- If String1 has more characters than String2 then it will return 1
- If String1 has less characters than String2 then it will return negative value
- If String1 has same  characters than String2 then it will return 0

## Enum

A class containing constant values is called enum. We can also make an enum inside a class but out of its method. Enum also works as array.

We can sout the values of enum class by loop in such manner:

```JAVA
for (*enum class name* el : *enum class name*.values()){
 sout(el)
}
```

- .value = tells the value of constant.i.e,\
`enum class name*.constant.attribute;`

.ordinal() = tells the index of the constant.i.e,\
`enum class name*.valueOf("constant").ordinal();`

### Advantage

We can pass constant values in any attribute of class and we can atterate loop on those constants as well.

## Database (SQL)

- DDL(Data Definition Language)
- DML(Data Manipulation Language)
- ERT(Entity Relation Diagram)
- SQL: It is a query language which is use to communicate with the database
- Schema: It is use to define how data is organized.
- We store our data in tables.
- Primary key: The unique key of any attribute of table is primary key. We perform operations through primary key.
- Foreign key: kisi doosre table ki primary key.Doosre table sa relation bnane k lie. Foreign key hmesha many wale ma hogi.

### Types of relation

There are three types of relationships in database:

1. One to one
Aik table ma doosre product ki aik hi category sa taaluq ho. For e.g:
Aik comment k relation aik hi post sa hota h.
Is relation ma pehle table ma foreign key aaegi jis ka taaluq doosre table ki id sa hoga. It is denoted by:
A --|----------------|-- B

2. One to many
Aik table ka doosre table ki aik sa ziada categories sa taaluq ho. For e.g:
Aik post k relation bht sa comments sa hota h.
Foreign key many wale table ma aaegi. It is denoted by:
A -->----------------|-- B
  
3. Many to many =
Jb dono side sa one to many k relation ho to wo many to many k relation hota h. Lkin y relation tb lgega jb apko duplicate sa frq prta ho. For e.g:
Aik student k pas bht sarey courses hn aur 1 course k pas bht sarey students bhi hn.
Is relation ma dono ma foreign key nhi aaegi blke aik teesra table bnta h jis ma dono tables ki foreign key aaegi. It is denoted by:
A -->----------------<-- B

### Types of join

- Inner join: use to make a relationship between two tables. Lkin sirf whi data aaega jinka koi doosre table sa relation hoga.
- Left join: use to make a relationship between two tables. gives all the data of the left side of left join. i.e,
`select * from c inner join b on c.bid = b.id;`
- Right join: use to make a relationship between two tables. gives all the data of the right side of right join.i.e,
`select * from c inner join b on c.bid = b.id;`
- Self join: Makes a relationship with the column of its own table.
- As (alias) = Use to name a column for particular query.
- in = specific column k data wali value get krta h. aik sa ziada columns k through bhi get kr skta h. Jese anas name sa get krna.
- % kuch bhi aae.

SQL Functions =

- count(column_name / column_names / *): count
- AVG(column_name / column_names /*): average
- sum(column_name / column_names / *): sum

## Points

- toString(): Converts memory address into string.
- Scanner: Take input form user.
- Constructor: It is a special method because its name is the name of its class which has void type(does not return anything). It is use to store values in the attributes.
- instanceOf: This key is use to check the type of your desired value.i.e,

```JAVA
 if(num instanceOf Integer){ //num could be any type
  ...
 }
 ```

- To ceheck the type of attribute/value/arguments/variable, we use:
`num.getClass().toString()`
Results will be shown as : "class java.lang.String"
- .printStackTrace() = shows the exception in console
- hashcode() method: This method is use to generate the hashcode of objects which are used in sets.
