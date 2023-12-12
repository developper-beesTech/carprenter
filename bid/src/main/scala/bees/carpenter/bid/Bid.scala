package bees.carpenter.bid

import zio.{IO, ZIO}

trait InvalidBid

case class CreateBid(id: String)

case class BidCreated(id: String)

case class Bid(id: String, noticeId: String, bidderId: String, bidDetails: String)

object BidAggregate:
  
  def createBid(command: CreateBid): IO[InvalidBid, BidCreated] = ???

  


