Feature: Post Request

  Scenario Outline: Post Request to create a Booking

    Given Get Payload from a {string} and make a call

    Then Verify response message "<msg>"

    Examples:
      | url   | responsecode |
      | /auth | 200          |
