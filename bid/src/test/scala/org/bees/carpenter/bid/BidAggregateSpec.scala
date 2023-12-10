package org.bees.carpenter.bid
import zio.test.*

object BidAggregateSpec extends ZIOSpecDefault{

   def spec =
    suite("Enforcing biding policies")(
      
      test("Creating a bid should return a BidCreated event"){
        for{
          event <- BidAggregate.createBid(CreateBid("1"))
        } yield {
          assertTrue(event == BidCreated("1"))
        }
      }
    )
}

