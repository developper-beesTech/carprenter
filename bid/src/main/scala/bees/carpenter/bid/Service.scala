package bees.carpenter.bid

import zio.{IO, ZIO}

trait InvalidCompany

case class Company(companyDetails: String)

trait CompanyRegistryService:
  def getCompany(companyId: String): IO[InvalidCompany, Company]

trait EvaluationException

trait EvaluationResult

trait EvaluationService:
  def evaluateBid(bid:Bid):ZIO[CompanyRegistryService,EvaluationException,EvaluationResult]


