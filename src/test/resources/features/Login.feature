Feature: This file is useful to test login related scenario

  Scenario Outline: Verify User Cannot Login with Invalid Credentials
    Given user open website
    When user login with username "<username>" and password "<password>"
    Then verify invalid login error message is displayed

    Examples:
      | username | password |
      | admin    | abc123   |
      | chirag   | admin123 |
      | chirag   | 8564     |
      |          | admin123 |
      | admin    |          |

