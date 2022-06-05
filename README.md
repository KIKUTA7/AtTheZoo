This assignment provides the basic the infra-structure of zoo. A zoo consists of multiple enclosures (class Vivarium). A Vivarium contains multiple animals (class Animal). Moreover, a Vivarium has a year of construction int constructionYear and an area int area in square meters. Each Animal has a name String name. Moreover, each animal may have a distinct voracity for which reason there is an extra attribute int foodCosts for calculating the yearly feeding costs in Lari.

Klassendiagramm Zoo

Concerning this class diagram: The method getCosts() in Vivarium returns an int not a String.

Implementation
Realize the classes within the files of the template. Proceed as follows:

Realize the class Animal with the attributes int foodCosts and String name. Add a constructor Animal(String name, int foodCosts). The attributes should not be directly accessible from other classes. Add public getters for the two attributes.

Realize a class Vivarium with the attributes int area, int constructionYear and Animal[] inhabitants. The attributes should not be directly accessible from other classes. Add a constructor Vivarium(Animal[] inhabitants, int area, int constructionYear) which initializes the attributes appropriately.

Realize a class Zoo with the attribute Vivarium[] vivaria and the constructor Zoo(Vivarium[] vivaria). The attibutes shoulc not be directly accessible from other classes.

Now realize the method toString() for the classes Animal, Vivarium and Zoo.

toString() in class Animal: the String representation starts with an opening round bracket. Then comes "name:" followed with a blank and the animal's name attribute. Then follows ", foodCosts: " with the animal's foodCosts. The String to be returned is terminated with a closing round bracket. "(name: Pingu, foodCosts: 231)"

toString() in class Vivarium: the String representation starts with an opening square bracket. Then comes "area: " followed with the area of the vivarium. Then follows ", constructionYear: " followed by the vivarium's year of construction. After a ", animals: " follows the String representation of the animals, ordered according to their indices and separated by ", ". The returned String object is terminated with a closing square bracket. "[area: 34, constructionYear: 1965, animals: (name: Pingu, foodCosts: 231), (name: Pinguina, foodCosts: 270)]"

toString() in class Zoo: The returned String object starts with an opening curly bracket, followed by the String representation of the vivaria, separated by ", ". The String is terminated with a closing curly bracket. "{[area: 34, constructionYear: 1965, animals: (name: Pingu, foodCosts: 231), (name: Pinguina, foodCosts: 270)], [area: 54, constructionYear: 1968, animals: (name: Felix, foodCosts: 433), (name: Yoghi, foodCosts: 331)]}"

Now realize the method getCosts() for each of the classes Vivarium and Zoo.

getCosts() of class Vivarium returns the total costs of a vivarium per year in Lari. The total costs consist of the costs for feeding of its inhabitants plus fix costs for maintenance. The yearly maintenance costs are calulated according to the formula: 900 + area in square meters * 100 + area in square meters * (2021 - year of construction) * 5
getCosts() of class Zoo returns the sum of the yearly total costs of all vivaria of the zoo.
 Tests According to the Given Examples 0 of 3 tests passing
You need not realize a dedicated treatment of eventual int overflow.

Hints:

Take care for your implementation to realize identical program logic at most once.
Only after you have created all attributes and methods, the behavioral tests will be executed. Upto then, these report "Test was not executed".
