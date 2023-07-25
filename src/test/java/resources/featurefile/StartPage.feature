@regression

Feature: Find Visa Route
  As user I want to find Visa Category Route

      @smoke
      Scenario: Verify the User is an Australian Coming To UK For Tourism
        Given User on Home Page
        When  Click On Start Page
        And   Select Nationality "Australia"
        And   Click on Next Step
        And   Select Reason for Travel  "Tourism or visiting family and friends"
        And   Click On Continue Button
        Then User should see Visa Result "You will not need a visa to come to the UK"


      @sanity
      Scenario: Verify the User a Chile an Coming To The UK For Work And Plans On Staying For Longer Than Six Months
        Given User on Home Page
        When  Click On Start Page
        And   Select Nationality "Chile"
        And   Click on Next Step
        And   Select Reason for Travel  "Work, academic visit or business"
        And   Click On Continue Button
        And   Select Duration of Stay "longer than 6 months"
        And   Click on Continue Button of Duration Page
        And   Select have planning to Work for "Health and care professional"
        And   Click on Continue Button of planning for Work
        Then  User should see visa result "You need a visa to work in health and care"

        @smoke,@sanity
        Scenario: Verify the User a Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article 10Or20 Card
          Given User on Home Page
          When  Click On Start Page
          And   Select Nationality "Congo"
          And   Click on Next Step
          And   Select Reason for Travel  "Join partner or family for a long stay"
          And   Click On Continue Button
          And   State My Partner of Family memeber have uk immigration Status "Yes"
          And   Click on continue Button of Family Member Page






