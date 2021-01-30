package _05_vault;

public class JamesBond {
public static int findCode(Vault vault) {
	for (int i = 0; i < 1000000; i++) {
		boolean x=vault.tryCode(i);
		if(x==true) {

		return i;}


		
}
	return -1;
}
public static void main(String[] args) {
	Vault vault1 = new Vault(246810);
	
	int z= findCode(vault1);
	System.out.println(z);
}

}
