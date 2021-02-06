package _06_duck;

public class Kylo_not_a_duck {
int numberofToys;
String favoriteToy;
Kylo_not_a_duck(String favoriteToy, int numberofToys) {
       this.favoriteToy = favoriteToy;
       this.numberofToys = numberofToys;
       System.out.println("Hello, my name is Kylo. My favorite toy is " + favoriteToy + ".");
       System.out.println("I have " + numberofToys + " toys.");
}
void bark() {
	System.out.println("woofwoofwoofwoofyipyipyipBARKBARKHOWLLLLLLL");
}
void skip() {
	System.out.println("why my legs no work ;-;");
}
}
