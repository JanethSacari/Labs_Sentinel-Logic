#include <iostream>
#include <string>

/**
 * Sentinel Logic Labs - Mission Critical Module
 * Concept: Radar Signal Integrity Check
 * Connection: Precision and focus, just like in Kyokushin training.
 */

int main() {
    // In C++, we manage memory and state with precision.
    bool isRadarActive = true;
    int signalStrength = 85; // Percentual 0-100
    std::string sectorName = "North-Alpha";

    std::cout << "--- Initializing Sentinel Radar Monitor ---" << std::endl;

    if (isRadarActive && signalStrength > 75) {
        std::cout << "[STATUS] System Stable in Sector: " << sectorName << std::endl;
        std::cout << "[INFO] Strong Signal Detected. Monitoring clear." << std::endl;
    } else {
        // Just like a lapse in focus during training, we must catch this!
        std::cout << "[ALERT] Weak Signal or System Inactive!" << std::endl;
    }

    // Returning 0 indicates a successful mission (exit code).
    return 0;
}