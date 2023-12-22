package Adapter;

public class Coin implements CoinInt{

    int goldCoin = 0;
    int silverCoin = 0;
    int bronzeCoin = 0;
    public Coin(int goldCoin, int silverCoin, int bronzeCoin)
    {
        this.goldCoin = goldCoin;
        this.silverCoin = silverCoin;
        this.bronzeCoin = bronzeCoin;
    }

    @Override
    public int getGoldCoin() {
        return goldCoin;
    }

    @Override
    public int getSilverCoin() {
        return silverCoin;
    }

    @Override
    public int getBronzeCoin() {
        return bronzeCoin;
    }
}
