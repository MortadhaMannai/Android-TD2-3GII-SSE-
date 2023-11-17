# Android-TD2-3GII-SSE-

Author:Manai Mortadha

---

# Exercise 4: Country List App

This application demonstrates a simple implementation of displaying a list of countries using a RecyclerView. Each item in the list consists of the country's name and an image representing a famous monument or landmark from that country. Clicking on an item displays a toast message indicating the selected country.

## Features

- Displays a list of countries with their names and corresponding images.
- Uses RecyclerView to efficiently manage and display the list of countries.
- Allows users to interact by clicking on a country item to view a toast message.

## Implementation Details

- `CountryAdapter.java`: Manages the RecyclerView and binds data to the list items. It inflates the layout for each country item and handles item click events to display a toast message.
- `Country.java`: Represents a Country object with attributes such as name and image resource.
- `MainActivity.java`: Sets up the RecyclerView and populates it with a list of countries. Demonstrates the usage of the `CountryAdapter` to display the data.

## How to Use

1. Clone or download this repository.
2. Open the project in Android Studio.
3. Run the app on an emulator or a physical device.
4. Upon launch, the app will display a list of countries.
5. Click on any country item to view a toast message with the selected country's name.

## Customization

- To add more countries or change the displayed images, modify the `getCountryList()` method in `MainActivity.java` by adding new `Country` objects with their respective names and image resources.
- Adjust the layout in `item_country.xml` to customize the appearance of each country item in the list.

## Screenshots

- Include screenshots or GIFs showcasing the app's functionality and appearance.

## Notes

- Additional notes or considerations about the implementation or specific details can be added here.


