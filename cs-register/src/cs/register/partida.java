/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.register;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author luis
 */
public class partida implements Serializable{
    
    private Integer  kill ;
    private Integer death ;
    private Integer assist;
    private Integer wld;
    private Integer score;
    private Integer rank;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.kill);
        hash = 13 * hash + Objects.hashCode(this.death);
        hash = 13 * hash + Objects.hashCode(this.assist);
        hash = 13 * hash + Objects.hashCode(this.wld);
        hash = 13 * hash + Objects.hashCode(this.score);
        hash = 13 * hash + Objects.hashCode(this.rank);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final partida other = (partida) obj;
        if (!Objects.equals(this.kill, other.kill)) {
            return false;
        }
        if (!Objects.equals(this.death, other.death)) {
            return false;
        }
        if (!Objects.equals(this.assist, other.assist)) {
            return false;
        }
        if (!Objects.equals(this.wld, other.wld)) {
            return false;
        }
        if (!Objects.equals(this.score, other.score)) {
            return false;
        }
        if (!Objects.equals(this.rank, other.rank)) {
            return false;
        }
        return true;
    }
    
    
   public partida() {
       
    }

    public partida(Integer kill, Integer death, Integer assist, Integer wld, Integer socore, Integer rank) {
        this.kill = kill;
        this.death = death;
        this.assist = assist;
        this.wld = wld;
        this.score = socore;
        this.rank = rank;
    }

            
            
            
    /**
     * @return the kill
     */
    public Integer getKill() {
        return kill;
    }

    /**
     * @param kill the kill to set
     */
    public void setKill(Integer kill) {
        this.kill = kill;
    }

    /**
     * @return the death
     */
    public Integer getDeath() {
        return death;
    }

    /**
     * @param death the death to set
     */
    public void setDeath(Integer death) {
        this.death = death;
    }

    /**
     * @return the assist
     */
    public Integer getAssist() {
        return assist;
    }

    /**
     * @param assist the assist to set
     */
    public void setAssist(Integer assist) {
        this.assist = assist;
    }

    /**
     * @return the wld
     */
    public Integer getWld() {
        return wld;
    }

    /**
     * @param wld the wld to set
     */
    public void setWld(Integer wld) {
        this.wld = wld;
    }

    /**
     * @return the score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * @return the rank
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "partida{" + "kill=" + kill + ", death=" + death + ", assist=" + assist + ", wld=" + wld + ", socore=" + score + ", rank=" + rank + '}';
    }
    
}
