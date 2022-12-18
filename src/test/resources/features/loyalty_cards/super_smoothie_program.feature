Feature: Super Smoothie Loyalty Program

  The more smoothies you buy, the more points you earn.

  Background:
    Given the following categories:
      | Drink     | Category | Points |
      | Banana    | Regular  | 15     |
      | Apple     | Fancy    | 30     |
      | Earl grey | Tea      | 10     |

  Scenario Outline: Earning points when purchasing smoothies
    Given Houari is a morning freshness member
    When Houari purchases <Quantity> <Drink> drinks
    Then he should earn <Points> points
    Examples:
      | Drink     | Quantity | Points |
      | Banana    | 2        | 30     |
      | Apple     | 3        | 90     |
      | Earl grey | 2        | 20     |