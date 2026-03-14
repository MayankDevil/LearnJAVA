
class Admin
{
    java.util.HashMap<String,String> admin = new java.util.HashMap<>();
    
    
    Admin(boolean isActive)
    {
        if (isActive)
        {
            admin.put("Alisha","null@void");
            admin.put("Mayank","root@Kali");
            admin.put("Devil","12345678");
            admin.put("SuperUser","access");
        }
    }
    
    protected java.util.HashMap<String,String> security()
    {
        return admin;
    }
}
