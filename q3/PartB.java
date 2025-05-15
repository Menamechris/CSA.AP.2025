public ArrayList<Match> buildMatches() {
    ArrayList<Match> Battles = new ArrayList<Match>();

    if(competitorList.size()%2 == 0) {
        for(int i = 0; i < competitorList.size()/2; i++) {
            Competitor comp1 = competitorList.get(i);
            Competitor comp2 = competitorList.get(competitorList.size()-i);
            Battles.add(new Match(comp1, comp2));
        }
    } else {
        for(int i = 1; i < competitorList.size()/2; i++) {
            Competitor comp1 = competitorList.get(i);
            Competitor comp2 = competitorList.get(competitorList.size()-i);
            Battles.add(new Match(comp1, comp2));
        }
    }
    return Battles;
}
