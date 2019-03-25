package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;
    
    public RockPaperScissorHandSign getWinner() {
        return Rochambeau(PAPER, SCISSOR, ROCK);
    }
    
    public RockPaperScissorHandSign getLoser() {
        return Rochambeau(SCISSOR, ROCK, PAPER);
    }
    
    private RockPaperScissorHandSign Rochambeau(RockPaperScissorHandSign scissor, RockPaperScissorHandSign rock, RockPaperScissorHandSign paper) {
        if (this == ROCK) {
            RockPaperScissorHandSign handSign = ROCK;
            return handSign.equals(ROCK) ? scissor : handSign.equals(scissor) ? SCISSOR : PAPER;
        } else if (this == PAPER) {
            RockPaperScissorHandSign handSign = PAPER;
            return handSign.equals(PAPER) ? rock : handSign.equals(rock) ? ROCK : SCISSOR;
        } else if (this == SCISSOR) {
            RockPaperScissorHandSign handSign = SCISSOR;
            return handSign.equals(SCISSOR) ? paper : handSign.equals(paper) ? PAPER : ROCK;
        } else {
            return null;
        }
    }
}
