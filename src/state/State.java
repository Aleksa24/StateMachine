/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import model.Paper;

/**
 *
 * @author student1
 */
public abstract class State {
    
    protected int stateHashCode;

    public void doSomething(Paper paper) {
        printCurrentState();
        showOptions(paper);
    }

    private void printCurrentState() {
        System.out.println("====================================================");
        System.out.println("State: " + this);
        System.out.println("====================================================");
    }

    protected abstract void showOptions(Paper paper);

    @Override
    public int hashCode() {
        return stateHashCode; 
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)return false;
        State state;
        if (obj instanceof State) {
            state = (State) obj;
        }else return false;
        if (this.stateHashCode == state.stateHashCode) {
            return true;
        }
        return false;
    }

    
    
}
