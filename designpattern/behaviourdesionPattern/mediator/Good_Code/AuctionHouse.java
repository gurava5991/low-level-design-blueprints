package designpattern.behaviourdesionPattern.mediator.Good_Code;

import java.util.ArrayList;
import java.util.List;

public class AuctionHouse implements AuctionMediator{
    List<Bidder> bidders = new ArrayList<>();
    @Override
    public void placeBid(Bidder bidder, int amount) {
        for (Bidder b : bidders) {
            if(b != bidder) b.receiveBid(bidder, amount);
        }
        
    }

    @Override
    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
    }
}
