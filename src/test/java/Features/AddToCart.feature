Feature: Add product to cart

  @smoke
  Scenario Outline: Add procduct to cart
    And login to application as "<username>" and "<password>"
    And Navigate to product and Search as "<product>"
    When User should add the product to cart
    Then verify product added to cart "<product>"

    Examples:
      | username             | password | product    | quantity | Name on Card | Card Number      | CVC | Month | Year |
      | deepak1223@gmail.com | Deepak   | Men Tshirt | 2        | Deepak       | 7854125963014587 | 478 | 05    | 2028 |
      | deepak1223@gmail.com | Deepak   | Tshirt     | 5        | Deepak       | 7854125963014587 | 478 | 05    | 2028 |
      | deepak1223@gmail.com | Deepak   | Tshirt     | 5        | Deepak       | 7854125963014588 | 479 | 06    | 2029 |
      | deepak1223@gmail.com | Deepak   | Tshirt     | 5        | Deepak       | 7854125963014589 | 479 | 07    | 2029 |
