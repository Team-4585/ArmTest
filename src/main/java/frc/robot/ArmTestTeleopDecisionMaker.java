package frc.robot;

public class ArmTestTeleopDecisionMaker {
  private ArmTestJoystick m_TheJoystick = new ArmTestJoystick();

  private ArmTest m_ArmTest = new ArmTest();



  ArmTestTeleopDecisionMaker(){

  }

  public void initialize(){
  }

  public void doDecisions(){

    // System.out.println("-- F/B: " + m_TheJoystick.getForwardBackwardValue() + 
    //          09          "   S/S: " + m_TheJoystick.getSideToSideValue() + 
    //                    "   Rot: " + m_TheJoystick.getTwistValue());
    m_ArmTest.moveArm(-m_TheJoystick.getForwardBackwardValue());
  


  }

  public void setArmTestSubSystem(ArmTest ArmTestSys){
    m_ArmTest = ArmTestSys;
  }


}
