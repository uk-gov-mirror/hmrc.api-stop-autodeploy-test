/*
 * Copyright 2019 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package unit.uk.gov.hmrc.services

import uk.gov.hmrc.http.HeaderCarrier
import uk.gov.hmrc.play.test.UnitSpec
import uk.gov.hmrc.services.{Hello, HelloWorldService}

class HelloWorldServiceSpec extends UnitSpec {

  trait Setup {
    implicit val hc: HeaderCarrier = HeaderCarrier()
    val underTest = new HelloWorldService
  }

  "fetchWorld" should {
    "return correct message" in new Setup {
      val result: Hello = await(underTest.fetchWorld)

      result.message shouldBe "Hello World"
    }
  }

  "fetchApplication" should {
    "return correct message" in new Setup {
      val result: Hello = await(underTest.fetchApplication)

      result.message shouldBe "Hello Application"
    }
  }

  "fetchUser" should {
    "return correct message" in new Setup {
      val result: Hello = await(underTest.fetchUser)

      result.message shouldBe "Hello User"
    }
  }
}
