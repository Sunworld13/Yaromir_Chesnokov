package Adapter;

public class StealCoin implements StealCoinInt{
    int stealCoin = 0;
    public StealCoin(int stealCoin)
    {
        this.stealCoin = stealCoin;
    }
    @Override
    public int getStealCoin() {
        return stealCoin;
    }
}
