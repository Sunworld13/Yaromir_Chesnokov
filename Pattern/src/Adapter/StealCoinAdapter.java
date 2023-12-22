package Adapter;

public class StealCoinAdapter implements CoinInt {

    private StealCoinInt stealCoin;
    public StealCoinAdapter(StealCoinInt stealCoin)
    {
        this.stealCoin = stealCoin;
    }

    @Override
    public int getBronzeCoin() {
        return stealCoin.getStealCoin() % 100;
    }

    @Override
    public int getSilverCoin() {
        return (stealCoin.getStealCoin() / 100)%83;
    }

    @Override
    public int getGoldCoin() {
        return stealCoin.getStealCoin() / (100*83);
    }
}
