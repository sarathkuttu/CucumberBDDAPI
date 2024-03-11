Feature: Get All booking and Verify

  Scenario Outline: Get All booking and Verify Status code

    Given Get call to "<url>"

    Then Response code "<responseCode>" is verified

    Examples:
      | url      | responsecode |
      | /booking | 200          |
