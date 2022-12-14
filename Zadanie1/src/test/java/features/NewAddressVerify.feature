Feature: Weryfikacja nowo dodanego adresu
  Scenario Outline: Dodanie nowego adresu oraz jego weryfikacja
    Given Uzytkownik znajduje sie na stronie glownej aplikacji
    When Uzytkownik wybiera opcje Sign In
    And Uzytkownik wpisuje poprawny email oraz haslo a nastepnie zatwierdza  dane poprzez klikniecie przycisku zalogowania
    And Przechodzi do zakladki z adresami i wybiera opcje dodania nowego adresu dostawy
    Then Wypelnia dane formularza "<formAlias>", "<formAddress>", "<formCity>", "<formZipCode>" oraz "<formPhone>" oraz zatwierdza dodanie adresu.
    And Waliduje poprawnosc wpisanych danych
    And Usuwa oraz waliduje usunięcie nowo dodanego adresu
    And Zamyka przeglądarkę


    Examples:
    |formAlias|formAddress|formCity|formZipCode|formPhone|
    |Home|39 Bruce Street|Swindon|SN22EL|0782564410|





