package packageMoney;

import java.util.Vector;

public class Money {
	
	private int fAmount;
	private String fCurrency;
	
	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}
	
	public int amount() {
	return fAmount;
	}
	
	public String currency() {
	return fCurrency;
	}
	
	public Money add(Money m) {
	return new Money(amount() + m.amount(), currency());
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    Money other = (Money) obj;
	    return fAmount == other.fAmount && fCurrency.equals(other.fCurrency);
	}
}

class MoneyBag {
	
	private Vector<Money> fMonies = new Vector<Money>();
	
		MoneyBag(Money m1, Money m2) {
				appendMoney(m1); 
				appendMoney(m2);
		}
		MoneyBag(Money bag[]) {
			for (int i = 0; i < bag.length; i++)
				appendMoney(bag[i]);
		}
		private void appendMoney(Money m) {
			if (fMonies.isEmpty()) {
				fMonies.add(m);
			} else {
				int i = 0;
				while ((i < fMonies.size())
						&& (!(fMonies.get(i).currency().equals(m.currency()))))
					i++;
				if (i >= fMonies.size()) {
					fMonies.add(m);
				} else {
					fMonies.set(i, new Money(fMonies.get(i).amount() +
							m.amount(),
							m.currency()));
				}
			}
		}
		
		public boolean equals(Object obj) {
	        // Vérifier si l'objet est une instance de MoneyBag
	        if (obj instanceof MoneyBag) {
	            MoneyBag other = (MoneyBag) obj;
	            // Comparer la taille des listes fMonies
	            if (this.fMonies.size() != other.fMonies.size()) {
	                return false;
	            }
	            // Comparer chaque élément de la liste fMonies
	            for (Money money : this.fMonies) {
	                if (!other.fMonies.contains(money)) {
	                    return false;
	                }
	            }
	            return true;
	        }
	        return false;
	    }
}
