package _05_vault;

public class Vault {
int secretcode;
public Vault(int setcode) {
	this.secretcode=setcode;
}
public boolean tryCode(int number) {
	if (number==secretcode) {
		return true;
	}
	return false;
}
/*public static void main(String[] args) {
	for (int i = 0; i < 1000000; i++) {
		boolean x=tryCode(i);
		if(x==true) {
		System.out.println(x);
		System.out.println(i);
	}*/

}
