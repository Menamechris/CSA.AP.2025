public int walkDogs(int hour) {
    //num of available dogs from company
    int numDogs = numAvailableDogs(hour);

    //if the maxDogs exceeds num of dogs available
    
    if(maxDogs>=numDogs) {
        company.updateDogs(hour, numDogs);
        return numDogs;
    } else {
        company.updateDogs(hour, maxDogs);
        return maxDogs;
    }
}
