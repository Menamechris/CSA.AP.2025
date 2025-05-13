public int dogWalkShift(int startHour, int endHour) {
    int bounsCount = 0;
    int count = 0
    for(int i =  startHour; i <= endHour; i++) {
        if(walkDogs(hour) == maxDogs || (hour >= 9 && hour <= 17)) {
            bounsCount++;
            count++;
        } else {
            count+=walkDogs(hour);
        }
    }
    return count += (bounsCount*3);
}
