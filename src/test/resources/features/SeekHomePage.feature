Feature: This feature file covers scenarios for Seek home page

  #This scenario is for verifying Job Search feature on home page
  Scenario Outline: Verify on entering keywords job results should displayed
    Given user is on seek landing page
    When user enters "<What>" "<Classification>" "<Where>" in search boxes
    Then relevant search results are displayed
    Examples:
      | What    | Classification                         | Where                |
      | Testing | Information & Communication Technology | Parramatta NSW 2150  |
      | Nursing | Community Services & Development       | North Rocks NSW 2151 |

      #This scenario is for verifying working of Sign In button on home page
  Scenario:Verify on clicking Sign In button Sign In landing page should displayed
    Given user is on seek landing page
    When user clicks on Sign In button
    Then Sign In page should displayed

     #This scenario is for verifying working of Employer Site button on home page
  Scenario:Verify on clicking Employer Site button Seek Employer page should displayed
    Given user is on seek landing page
    When user clicks on Employer Site button
    Then Seek Employer page should displayed



