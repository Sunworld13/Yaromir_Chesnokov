package Adapter;

public class Main {
    public static void main(String[] args)
    {
        /*StealCoinAdapter coin = new StealCoinAdapter(new StealCoin(83501));
        System.out.println(coin.getGoldCoin() + ";" + coin.getSilverCoin()+';'+coin.getBronzeCoin());*/

        CoinAdapter coin = new CoinAdapter(new Coin(10,6,70));
        System.out.println(coin.getStealCoin());

    }
}
