#include <iostream>

int main() {
    // In Java: String status = "Active";
    // In C++ for speedometers: We use pointers or references for speed.
    std::string radarStatus = "SCANNING";
    int detectedTargets = 12;

    std::cout << "--- Radar Sentinel System ---" << std::endl;
    std::cout << "Status: " << radarStatus << std::endl;
    std::cout << "Targets in sector: " << detectedTargets << std::endl;

    // Crucial difference: Returning 0 tells Linux that the process finished SUCCESSFULLY.
    return 0;
}