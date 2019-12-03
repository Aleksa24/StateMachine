/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stateMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import state.AcceptedState;
import state.CancelState;
import state.RejectState;
import state.ReviewState;
import state.State;
import state.WritingState;

/**
 *
 * @author Aleksa
 */
public class StateMachine {
    
    private Map<State,List<State>> model;
    private State curentState;

    public StateMachine() {
        curentState = new WritingState();
        model = new HashMap<>();
        List<State> transitions;
        
        transitions = new ArrayList<>();
        transitions.add(new WritingState());
        transitions.add(new CancelState());
        transitions.add(new ReviewState());
        model.put(new WritingState(), transitions);
        
        transitions = new ArrayList<>();
        transitions.add(new ReviewState());
        transitions.add(new AcceptedState());
        transitions.add(new RejectState());
        model.put(new ReviewState(), transitions);
        
        transitions = new ArrayList<>();
        transitions.add(new RejectState());
        model.put(new RejectState(), transitions);
        
        transitions = new ArrayList<>();
        transitions.add(new AcceptedState());
        model.put(new AcceptedState(), transitions);
        
        transitions = new ArrayList<>();
        transitions.add(new CancelState());
        model.put(new CancelState(), transitions);
    }

    public StateMachine(Map<State, List<State>> model) {
        this.model = model;
    }

    public Map<State, List<State>> getModel() {
        return model;
    }

    public State getCurentState() {
        return curentState;
    }

    public void setCurentState(State curentState) {
        this.curentState = curentState;
    }
    
    
    
}
