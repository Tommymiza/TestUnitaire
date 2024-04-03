package packageMoney;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Création de deux objets Money
        Money money1 = new Money(100, "USD");
        Money money2 = new Money(50, "USD");

        // Affichage des montants et des devises initiaux
        System.out.println("Montant 1 : " + money1.amount() + " " + money1.currency());
        System.out.println("Montant 2 : " + money2.amount() + " " + money2.currency());

        // Addition des deux montants
        Money total = money1.add(money2);

        // Affichage du montant total
        System.out.println("Montant total : " + total.amount() + " " + total.currency());
	}

}
