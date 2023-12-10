package bees.carpenter.bid

import BidAggregate.Bid
import BidAggregate.Bid
import zio.{IO, ZIO}

trait InvalidCompany

case class Company(companyDetails: String)

trait CompanyRegistryService {
  def getCompany(companyId: String): IO[InvalidCompany, Company]
}

trait EvaluateBidService {
  
  def evaluate(bid: Bid): ZIO[CompanyRegistryService, InvalidCompany, Bid]
}