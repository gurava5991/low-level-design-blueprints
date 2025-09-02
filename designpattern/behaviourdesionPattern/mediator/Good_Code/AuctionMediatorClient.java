package designpattern.behaviourdesionPattern.mediator.Good_Code;

public class AuctionMediatorClient {
    public static void main(String[] args) {
        AuctionMediator auctionHouse = new AuctionHouse();
        Bidder b1 = new Bidder(auctionHouse, "Bidder 1");
        Bidder b2 = new Bidder(auctionHouse, "Bidder 2");
        Bidder b3 = new Bidder(auctionHouse, "Bidder 3");
        Bidder b4 = new Bidder(auctionHouse, "Bidder 4");
        auctionHouse.registerBidder(b1);
        auctionHouse.registerBidder(b2);
        auctionHouse.registerBidder(b3);
        auctionHouse.registerBidder(b4);
        b1.placeBid(100);
        b2.placeBid(200);
        b3.placeBid(300);

    }
}
