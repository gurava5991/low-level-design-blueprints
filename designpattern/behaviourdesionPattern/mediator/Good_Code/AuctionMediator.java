package designpattern.behaviourdesionPattern.mediator.Good_Code;

public interface AuctionMediator {
    void registerBidder(Bidder bidders);
    void placeBid(Bidder bidder ,  int amount);
}
