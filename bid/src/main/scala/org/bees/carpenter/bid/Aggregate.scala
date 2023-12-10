package org.bees.carpenter.bid

import zio.{IO, ZIO}

object BidAggregate {
  trait InvalidBid
  
  case class Bid(id: String,noticeId:String,bidderId:String ,bidDetails:String)

  def createBid(command: CreateBid): IO[InvalidBid, BidCreated] = ???
  
  
}

