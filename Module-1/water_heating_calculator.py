# Program to calculate the energy needed to heat water
# Author: Amit Rizal
# Date: 01/12/2025
# Purpose: To calculate the energy required to heat water from an initial temperature to a final temperature.

# Constants
SPECIFIC_HEAT_CAPACITY = 4184  # Specific heat capacity of water in J/(kg*C)

def main():
    # Prompt user for inputs
    try:
        water_mass = float(input("Enter the amount of water in kilograms: "))
        initial_temperature = float(input("Enter the initial temperature of the water in Celsius: "))
        final_temperature = float(input("Enter the final temperature of the water in Celsius: "))

        # Calculate the energy required (Q)
        energy = water_mass * (final_temperature - initial_temperature) * SPECIFIC_HEAT_CAPACITY

        # Display the result
        print(f"The energy needed to heat {water_mass} kg of water from {initial_temperature} °C to {final_temperature} °C is {energy:.2f} Joules.")
    except ValueError:
        print("Invalid input. Please enter numeric values.")

# Call the main function
if __name__ == "__main__":
    main()
