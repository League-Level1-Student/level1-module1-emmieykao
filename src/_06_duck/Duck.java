package _06_duck;

public class Duck {
int numberOfFriends;
String favoriteFood;
Duck(String favoriteFood, int numberOfFriends) {
    this.favoriteFood = favoriteFood;
    this.numberOfFriends = numberOfFriends;  
    System.out.println("Hello! My favorite food is " + favoriteFood + ".");
    System.out.println("I have " + numberOfFriends + " friends.");
}
void quack() {
	System.out.println("quackquackquackQUACKKKKKKKK");
}
void waddle() {
	System.out.println("waddle waddle waddle [to the lemonade stand]");
}
}
