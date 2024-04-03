package packageMoney;

interface IMoney {
    IMoney addMoney(Money m);
    IMoney addMoneyBag(MoneyBag mb);
	IMoney add(IMoney m);
	IMoney addMoney(MoneyBag expected);
}