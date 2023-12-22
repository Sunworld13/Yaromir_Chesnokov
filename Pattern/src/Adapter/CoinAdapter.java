package Adapter;

public class CoinAdapter implements StealCoinInt {
    private CoinInt coin;
    public CoinAdapter(CoinInt coin)
    {
        this.coin = coin;
    }

    @Override
    public int getStealCoin() {
        return coin.getGoldCoin()*83*100 + coin.getSilverCoin()*100 + coin.getBronzeCoin();
    }
}
