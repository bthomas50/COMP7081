package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author aequites
 */
public class ClientHelperBar extends JPanel implements ActionListener
{
    private final JButton m_jbQLogin = new JButton("Quick Login");
    private final JButton m_jbAdd = new JButton("Add");
    private final JButton m_jbDel = new JButton("Del");
    private final JButton m_jbRole = new JButton("Role");
    private final JButton m_jbTeam = new JButton("Team");
    private final JButton m_jbCompany = new JButton("Company");
    private final JCheckBox m_jchkTC = new JCheckBox("Team Chat");
    private final JCheckBox m_jchkCC = new JCheckBox("Company Chat");
    
    private final ClientLoginDialog m_dlgQLogin;
    private final ClientAddUserDialog m_dlgAdd;
    private final ClientDelUserDialog m_dlgDel;
    private final ClientSetRoleDialog m_dlgRole;
    private final ClientSetTeamDialog m_dlgTeam;
    private final ClientSetCompanyDialog m_dlgCompany;

    private final ClientGUI m_pParent;
    
    public ClientHelperBar(ClientGUI pParent)
    {
        m_pParent = pParent;
        
        m_jbQLogin.addActionListener(this);
        m_jbAdd.addActionListener(this);
        m_jbDel.addActionListener(this);
        m_jbRole.addActionListener(this);
        m_jbTeam.addActionListener(this);
        m_jbCompany.addActionListener(this);
        m_jchkTC.addActionListener(this);
        m_jchkCC.addActionListener(this);
        
        this.add(m_jbQLogin);
        this.add(m_jbAdd);
        this.add(m_jbDel);
        this.add(m_jbRole);
        this.add(m_jbTeam);
        this.add(m_jbCompany);
        this.add(m_jchkTC);
        this.add(m_jchkCC);

        m_dlgQLogin = new ClientLoginDialog(pParent, false);
        m_dlgAdd = new ClientAddUserDialog(pParent, false);
        m_dlgDel = new ClientDelUserDialog(pParent, false);
        m_dlgRole = new ClientSetRoleDialog(pParent, false);
        m_dlgTeam = new ClientSetTeamDialog(pParent, false);
        m_dlgCompany = new ClientSetCompanyDialog(pParent, false);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
	Object o = e.getSource();
        JDialog d = null;

        if (!m_pParent.connected)
        {
            if (o == m_jbQLogin) d = m_dlgQLogin;
        }
        else
        {
            if (o == m_jbAdd) d = m_dlgAdd; else
            if (o == m_jbDel) d = m_dlgDel; else
            if (o == m_jbRole) d = m_dlgRole; else
            if (o == m_jbTeam) d = m_dlgTeam; else
            if (o == m_jbCompany) d = m_dlgCompany;
        }
        
        if (d != null)
        {
            d.setLocationRelativeTo(m_pParent);
            d.setVisible(true);
        }
    }
    
    public boolean isTeamChatOn()
    {
        return m_jchkTC.isSelected();
    }

    public boolean isCompanyChatOn()
    {
        return m_jchkCC.isSelected();
    }
}
