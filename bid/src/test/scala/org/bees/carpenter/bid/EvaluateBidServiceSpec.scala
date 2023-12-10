package org.bees.carpenter.bid

import zio.test.{ZIOSpecDefault, assertTrue}

object EvaluateBidServiceSpec extends ZIOSpecDefault {
  
  def spec=
    suite("Bid evaluation")(
      test("Bidder should be a valid company") {
        
        assertTrue(true)
      }
    )
}
