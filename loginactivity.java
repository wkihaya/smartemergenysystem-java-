<html>
<head>
<title>LoginActivity.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cf8e6d;}
.s1 { color: #bcbec4;}
.s2 { color: #bcbec4;}
.s3 { color: #7a7e85;}
.s4 { color: #6aab73;}
</style>
</head>
<body bgcolor="#1e1f22">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
LoginActivity.java</font>
</center></td></tr></table>
<pre><span class="s0">package </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">;</span>

<span class="s0">import static </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">.</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">menu_about</span><span class="s2">;</span>
<span class="s0">import static </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">.</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">menu_help</span><span class="s2">;</span>
<span class="s0">import static </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">.</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">menu_exit</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">annotation</span><span class="s2">.</span><span class="s1">SuppressLint</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">content</span><span class="s2">.</span><span class="s1">Intent</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">os</span><span class="s2">.</span><span class="s1">Bundle</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">text</span><span class="s2">.</span><span class="s1">TextUtils</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">view</span><span class="s2">.</span><span class="s1">Menu</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">view</span><span class="s2">.</span><span class="s1">MenuItem</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">Button</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">EditText</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">Toast</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">annotation</span><span class="s2">.</span><span class="s1">NonNull</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">appcompat</span><span class="s2">.</span><span class="s1">app</span><span class="s2">.</span><span class="s1">AppCompatActivity</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">appcompat</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">Toolbar</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">auth</span><span class="s2">.</span><span class="s1">FirebaseAuth</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">auth</span><span class="s2">.</span><span class="s1">FirebaseUser</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">DataSnapshot</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">DatabaseError</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">DatabaseReference</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">FirebaseDatabase</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">ValueEventListener</span><span class="s2">;</span>

<span class="s0">public class </span><span class="s1">LoginActivity </span><span class="s0">extends </span><span class="s1">AppCompatActivity </span><span class="s2">{</span>

    <span class="s0">private </span><span class="s1">EditText emailInput</span><span class="s2">, </span><span class="s1">passwordInput</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">Button loginButton</span><span class="s2">, </span><span class="s1">registerButton</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">FirebaseAuth mAuth</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">DatabaseReference usersRef</span><span class="s2">;</span>

    <span class="s1">@Override</span>
    <span class="s0">protected void </span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">Bundle savedInstanceState</span><span class="s2">) {</span>
        <span class="s0">super</span><span class="s2">.</span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">savedInstanceState</span><span class="s2">);</span>
        <span class="s1">setContentView</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">layout</span><span class="s2">.</span><span class="s1">activity_login</span><span class="s2">);</span>

        <span class="s3">// Setup toolbar for the options menu</span>
        <span class="s1">Toolbar toolbar </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">loginToolbar</span><span class="s2">);</span>
        <span class="s1">setSupportActionBar</span><span class="s2">(</span><span class="s1">toolbar</span><span class="s2">);</span>

        <span class="s3">// Initialize UI components</span>
        <span class="s1">emailInput </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">email</span><span class="s2">);</span>
        <span class="s1">passwordInput </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">password</span><span class="s2">);</span>
        <span class="s1">loginButton </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">btnLogin</span><span class="s2">);</span>
        <span class="s1">registerButton </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">btnRegister</span><span class="s2">);</span>

        <span class="s3">// Initialize Firebase Auth and Database Reference</span>
        <span class="s1">mAuth </span><span class="s2">= </span><span class="s1">FirebaseAuth</span><span class="s2">.</span><span class="s1">getInstance</span><span class="s2">();</span>
        <span class="s1">usersRef </span><span class="s2">= </span><span class="s1">FirebaseDatabase</span><span class="s2">.</span><span class="s1">getInstance</span><span class="s2">().</span><span class="s1">getReference</span><span class="s2">(</span><span class="s4">&quot;users&quot;</span><span class="s2">);</span>

        <span class="s3">// Set up button click listeners</span>
        <span class="s1">loginButton</span><span class="s2">.</span><span class="s1">setOnClickListener</span><span class="s2">(</span><span class="s1">v -&gt; loginUser</span><span class="s2">());</span>
        <span class="s1">registerButton</span><span class="s2">.</span><span class="s1">setOnClickListener</span><span class="s2">(</span><span class="s1">v -&gt;</span>
                <span class="s1">startActivity</span><span class="s2">(</span><span class="s0">new </span><span class="s1">Intent</span><span class="s2">(</span><span class="s1">LoginActivity</span><span class="s2">.</span><span class="s0">this</span><span class="s2">, </span><span class="s1">RegisterActivity</span><span class="s2">.</span><span class="s0">class</span><span class="s2">))</span>
        <span class="s2">);</span>
    <span class="s2">}</span>

    <span class="s0">private void </span><span class="s1">loginUser</span><span class="s2">() {</span>
        <span class="s1">String email </span><span class="s2">= </span><span class="s1">emailInput</span><span class="s2">.</span><span class="s1">getText</span><span class="s2">().</span><span class="s1">toString</span><span class="s2">().</span><span class="s1">trim</span><span class="s2">();</span>
        <span class="s1">String password </span><span class="s2">= </span><span class="s1">passwordInput</span><span class="s2">.</span><span class="s1">getText</span><span class="s2">().</span><span class="s1">toString</span><span class="s2">().</span><span class="s1">trim</span><span class="s2">();</span>

        <span class="s3">// Validate input fields</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">TextUtils</span><span class="s2">.</span><span class="s1">isEmpty</span><span class="s2">(</span><span class="s1">email</span><span class="s2">) || </span><span class="s1">TextUtils</span><span class="s2">.</span><span class="s1">isEmpty</span><span class="s2">(</span><span class="s1">password</span><span class="s2">)) {</span>
            <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s0">this</span><span class="s2">, </span><span class="s4">&quot;Please enter both email and password.&quot;</span><span class="s2">, </span><span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_SHORT</span><span class="s2">).</span><span class="s1">show</span><span class="s2">();</span>
            <span class="s0">return</span><span class="s2">;</span>
        <span class="s2">}</span>

        <span class="s3">// Sign in the user</span>
        <span class="s1">mAuth</span><span class="s2">.</span><span class="s1">signInWithEmailAndPassword</span><span class="s2">(</span><span class="s1">email</span><span class="s2">, </span><span class="s1">password</span><span class="s2">)</span>
                <span class="s2">.</span><span class="s1">addOnCompleteListener</span><span class="s2">(</span><span class="s1">task -&gt; </span><span class="s2">{</span>
                    <span class="s0">if </span><span class="s2">(</span><span class="s1">task</span><span class="s2">.</span><span class="s1">isSuccessful</span><span class="s2">()) {</span>
                        <span class="s1">FirebaseUser user </span><span class="s2">= </span><span class="s1">mAuth</span><span class="s2">.</span><span class="s1">getCurrentUser</span><span class="s2">();</span>
                        <span class="s0">if </span><span class="s2">(</span><span class="s1">user </span><span class="s2">!= </span><span class="s0">null</span><span class="s2">) {</span>
                            <span class="s1">fetchUserRole</span><span class="s2">(</span><span class="s1">user</span><span class="s2">.</span><span class="s1">getUid</span><span class="s2">());</span>
                        <span class="s2">}</span>
                    <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
                        <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s1">LoginActivity</span><span class="s2">.</span><span class="s0">this</span><span class="s2">, </span><span class="s4">&quot;Login failed: &quot; </span><span class="s2">+</span>
                                        <span class="s2">(</span><span class="s1">task</span><span class="s2">.</span><span class="s1">getException</span><span class="s2">() != </span><span class="s0">null </span><span class="s2">? </span><span class="s1">task</span><span class="s2">.</span><span class="s1">getException</span><span class="s2">().</span><span class="s1">getMessage</span><span class="s2">() : </span><span class="s4">&quot;Unknown error&quot;</span><span class="s2">),</span>
                                <span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_SHORT</span><span class="s2">).</span><span class="s1">show</span><span class="s2">();</span>
                    <span class="s2">}</span>
                <span class="s2">});</span>
    <span class="s2">}</span>

    <span class="s0">private void </span><span class="s1">fetchUserRole</span><span class="s2">(</span><span class="s1">String uid</span><span class="s2">) {</span>
        <span class="s1">usersRef</span><span class="s2">.</span><span class="s1">child</span><span class="s2">(</span><span class="s1">uid</span><span class="s2">).</span><span class="s1">child</span><span class="s2">(</span><span class="s4">&quot;role&quot;</span><span class="s2">).</span><span class="s1">addListenerForSingleValueEvent</span><span class="s2">(</span><span class="s0">new </span><span class="s1">ValueEventListener</span><span class="s2">() {</span>
            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onDataChange</span><span class="s2">(</span><span class="s1">@NonNull DataSnapshot snapshot</span><span class="s2">) {</span>
                <span class="s1">String role </span><span class="s2">= </span><span class="s1">snapshot</span><span class="s2">.</span><span class="s1">getValue</span><span class="s2">(</span><span class="s1">String</span><span class="s2">.</span><span class="s0">class</span><span class="s2">);</span>
                <span class="s0">if </span><span class="s2">(</span><span class="s1">role </span><span class="s2">!= </span><span class="s0">null</span><span class="s2">) {</span>
                    <span class="s1">Intent intent </span><span class="s2">= </span><span class="s0">new </span><span class="s1">Intent</span><span class="s2">(</span><span class="s1">LoginActivity</span><span class="s2">.</span><span class="s0">this</span><span class="s2">, </span><span class="s1">HomeActivity</span><span class="s2">.</span><span class="s0">class</span><span class="s2">);</span>
                    <span class="s1">intent</span><span class="s2">.</span><span class="s1">putExtra</span><span class="s2">(</span><span class="s4">&quot;role&quot;</span><span class="s2">, </span><span class="s1">role</span><span class="s2">);</span>
                    <span class="s1">startActivity</span><span class="s2">(</span><span class="s1">intent</span><span class="s2">);</span>
                    <span class="s1">finish</span><span class="s2">();</span>
                <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
                    <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s1">LoginActivity</span><span class="s2">.</span><span class="s0">this</span><span class="s2">, </span><span class="s4">&quot;User role not found.&quot;</span><span class="s2">, </span><span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_SHORT</span><span class="s2">).</span><span class="s1">show</span><span class="s2">();</span>
                <span class="s2">}</span>
            <span class="s2">}</span>

            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onCancelled</span><span class="s2">(</span><span class="s1">@NonNull DatabaseError error</span><span class="s2">) {</span>
                <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s1">LoginActivity</span><span class="s2">.</span><span class="s0">this</span><span class="s2">, </span><span class="s4">&quot;Error reading role: &quot; </span><span class="s2">+ </span><span class="s1">error</span><span class="s2">.</span><span class="s1">getMessage</span><span class="s2">(), </span><span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_SHORT</span><span class="s2">).</span><span class="s1">show</span><span class="s2">();</span>
            <span class="s2">}</span>
        <span class="s2">});</span>
    <span class="s2">}</span>

    <span class="s3">// Menu methods</span>
    <span class="s1">@Override</span>
    <span class="s0">public boolean </span><span class="s1">onCreateOptionsMenu</span><span class="s2">(</span><span class="s1">Menu menu</span><span class="s2">) {</span>
        <span class="s1">getMenuInflater</span><span class="s2">().</span><span class="s1">inflate</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">menu</span><span class="s2">.</span><span class="s1">menu</span><span class="s2">, </span><span class="s1">menu</span><span class="s2">);</span>
        <span class="s0">return true</span><span class="s2">;</span>
    <span class="s2">}</span>

    <span class="s1">@Override</span>
    <span class="s0">public boolean </span><span class="s1">onOptionsItemSelected</span><span class="s2">(</span><span class="s1">MenuItem item</span><span class="s2">) {</span>
        <span class="s0">int </span><span class="s1">itemId </span><span class="s2">= </span><span class="s1">item</span><span class="s2">.</span><span class="s1">getItemId</span><span class="s2">();</span>

        <span class="s0">if </span><span class="s2">(</span><span class="s1">itemId </span><span class="s2">== </span><span class="s1">menu_about</span><span class="s2">) {</span>
            <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s0">this</span><span class="s2">, </span><span class="s4">&quot;SmartSense App v1.0 - For Deaf Emergency Alerts&quot;</span><span class="s2">, </span><span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_LONG</span><span class="s2">).</span><span class="s1">show</span><span class="s2">();</span>
            <span class="s0">return true</span><span class="s2">;</span>
        <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">itemId </span><span class="s2">== </span><span class="s1">menu_help</span><span class="s2">) {</span>
            <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s0">this</span><span class="s2">, </span><span class="s4">&quot;Enter your email and password to log in. Register if you are new.&quot;</span><span class="s2">, </span><span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_LONG</span><span class="s2">).</span><span class="s1">show</span><span class="s2">();</span>
            <span class="s0">return true</span><span class="s2">;</span>
        <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">itemId </span><span class="s2">== </span><span class="s1">menu_exit</span><span class="s2">) {</span>
            <span class="s1">finishAffinity</span><span class="s2">();</span>
            <span class="s0">return true</span><span class="s2">;</span>
        <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
            <span class="s0">return super</span><span class="s2">.</span><span class="s1">onOptionsItemSelected</span><span class="s2">(</span><span class="s1">item</span><span class="s2">);</span>
        <span class="s2">}</span>
    <span class="s2">}</span>
<span class="s2">}</span>
</pre>
</body>
</html>

<html>
<head>
<title>ReportsActivity.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cf8e6d;}
.s1 { color: #bcbec4;}
.s2 { color: #bcbec4;}
.s3 { color: #6aab73;}
.s4 { color: #7a7e85;}
</style>
</head>
<body bgcolor="#1e1f22">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
ReportsActivity.java</font>
</center></td></tr></table>
<pre><span class="s0">package </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">os</span><span class="s2">.</span><span class="s1">Bundle</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">text</span><span class="s2">.</span><span class="s1">InputType</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">EditText</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">Toast</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">annotation</span><span class="s2">.</span><span class="s1">NonNull</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">appcompat</span><span class="s2">.</span><span class="s1">app</span><span class="s2">.</span><span class="s1">AlertDialog</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">appcompat</span><span class="s2">.</span><span class="s1">app</span><span class="s2">.</span><span class="s1">AppCompatActivity</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">recyclerview</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">LinearLayoutManager</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">recyclerview</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">RecyclerView</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">.</span><span class="s1">adapter</span><span class="s2">.</span><span class="s1">AlertAdapter</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">.</span><span class="s1">model</span><span class="s2">.</span><span class="s1">AlertModel</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">DataSnapshot</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">DatabaseError</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">DatabaseReference</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">FirebaseDatabase</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">ValueEventListener</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">java</span><span class="s2">.</span><span class="s1">util</span><span class="s2">.</span><span class="s1">ArrayList</span><span class="s2">;</span>

<span class="s0">public class </span><span class="s1">ReportsActivity </span><span class="s0">extends </span><span class="s1">AppCompatActivity </span><span class="s2">{</span>

    <span class="s0">private </span><span class="s1">RecyclerView recyclerView</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">AlertAdapter adapter</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">ArrayList</span><span class="s2">&lt;</span><span class="s1">AlertModel</span><span class="s2">&gt; </span><span class="s1">alertList</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">DatabaseReference alertsRef</span><span class="s2">;</span>

    <span class="s1">@Override</span>
    <span class="s0">protected void </span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">Bundle savedInstanceState</span><span class="s2">) {</span>
        <span class="s0">super</span><span class="s2">.</span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">savedInstanceState</span><span class="s2">);</span>
        <span class="s1">setContentView</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">layout</span><span class="s2">.</span><span class="s1">activity_reports</span><span class="s2">);</span>

        <span class="s1">recyclerView </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">recyclerReports</span><span class="s2">);</span>
        <span class="s1">recyclerView</span><span class="s2">.</span><span class="s1">setLayoutManager</span><span class="s2">(</span><span class="s0">new </span><span class="s1">LinearLayoutManager</span><span class="s2">(</span><span class="s0">this</span><span class="s2">));</span>

        <span class="s1">alertList </span><span class="s2">= </span><span class="s0">new </span><span class="s1">ArrayList</span><span class="s2">&lt;&gt;();</span>
        <span class="s1">alertsRef </span><span class="s2">= </span><span class="s1">FirebaseDatabase</span><span class="s2">.</span><span class="s1">getInstance</span><span class="s2">().</span><span class="s1">getReference</span><span class="s2">(</span><span class="s3">&quot;alerts&quot;</span><span class="s2">);</span>

        <span class="s1">adapter </span><span class="s2">= </span><span class="s0">new </span><span class="s1">AlertAdapter</span><span class="s2">(</span><span class="s1">alertList</span><span class="s2">, </span><span class="s1">alertsRef</span><span class="s2">, </span><span class="s0">true</span><span class="s2">); </span><span class="s4">// true = admin mode</span>
        <span class="s1">recyclerView</span><span class="s2">.</span><span class="s1">setAdapter</span><span class="s2">(</span><span class="s1">adapter</span><span class="s2">);</span>

        <span class="s4">// Set adapter listener for edit/delete</span>
        <span class="s1">adapter</span><span class="s2">.</span><span class="s1">setOnAlertActionListener</span><span class="s2">(</span><span class="s0">new </span><span class="s1">AlertAdapter</span><span class="s2">.</span><span class="s1">OnAlertActionListener</span><span class="s2">() {</span>
            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onEdit</span><span class="s2">(</span><span class="s1">AlertModel alert</span><span class="s2">) {</span>
                <span class="s1">editAlert</span><span class="s2">(</span><span class="s1">alert</span><span class="s2">);</span>
            <span class="s2">}</span>

            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onDelete</span><span class="s2">(</span><span class="s1">AlertModel alert</span><span class="s2">) {</span>
                <span class="s1">alertsRef</span><span class="s2">.</span><span class="s1">child</span><span class="s2">(</span><span class="s1">alert</span><span class="s2">.</span><span class="s1">getId</span><span class="s2">()).</span><span class="s1">removeValue</span><span class="s2">()</span>
                        <span class="s2">.</span><span class="s1">addOnSuccessListener</span><span class="s2">(</span><span class="s1">unused -&gt;</span>
                                <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s1">ReportsActivity</span><span class="s2">.</span><span class="s0">this</span><span class="s2">, </span><span class="s3">&quot;Alert Deleted&quot;</span><span class="s2">, </span><span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_SHORT</span><span class="s2">).</span><span class="s1">show</span><span class="s2">())</span>
                        <span class="s2">.</span><span class="s1">addOnFailureListener</span><span class="s2">(</span><span class="s1">e -&gt;</span>
                                <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s1">ReportsActivity</span><span class="s2">.</span><span class="s0">this</span><span class="s2">, </span><span class="s3">&quot;Delete Failed&quot;</span><span class="s2">, </span><span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_SHORT</span><span class="s2">).</span><span class="s1">show</span><span class="s2">());</span>
            <span class="s2">}</span>
        <span class="s2">});</span>

        <span class="s1">loadAlerts</span><span class="s2">();</span>
    <span class="s2">}</span>

    <span class="s0">private void </span><span class="s1">loadAlerts</span><span class="s2">() {</span>
        <span class="s1">alertsRef</span><span class="s2">.</span><span class="s1">addValueEventListener</span><span class="s2">(</span><span class="s0">new </span><span class="s1">ValueEventListener</span><span class="s2">() {</span>
            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onDataChange</span><span class="s2">(</span><span class="s1">@NonNull DataSnapshot snapshot</span><span class="s2">) {</span>
                <span class="s1">alertList</span><span class="s2">.</span><span class="s1">clear</span><span class="s2">();</span>
                <span class="s0">for </span><span class="s2">(</span><span class="s1">DataSnapshot data </span><span class="s2">: </span><span class="s1">snapshot</span><span class="s2">.</span><span class="s1">getChildren</span><span class="s2">()) {</span>
                    <span class="s1">AlertModel alert </span><span class="s2">= </span><span class="s1">data</span><span class="s2">.</span><span class="s1">getValue</span><span class="s2">(</span><span class="s1">AlertModel</span><span class="s2">.</span><span class="s0">class</span><span class="s2">);</span>
                    <span class="s0">if </span><span class="s2">(</span><span class="s1">alert </span><span class="s2">!= </span><span class="s0">null</span><span class="s2">) {</span>
                        <span class="s1">alert</span><span class="s2">.</span><span class="s1">setId</span><span class="s2">(</span><span class="s1">data</span><span class="s2">.</span><span class="s1">getKey</span><span class="s2">()); </span><span class="s4">// store Firebase ID</span>
                        <span class="s1">alertList</span><span class="s2">.</span><span class="s1">add</span><span class="s2">(</span><span class="s1">alert</span><span class="s2">);</span>
                    <span class="s2">}</span>
                <span class="s2">}</span>
                <span class="s1">adapter</span><span class="s2">.</span><span class="s1">notifyDataSetChanged</span><span class="s2">();</span>
            <span class="s2">}</span>

            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onCancelled</span><span class="s2">(</span><span class="s1">@NonNull DatabaseError error</span><span class="s2">) {</span>
                <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s1">ReportsActivity</span><span class="s2">.</span><span class="s0">this</span><span class="s2">, </span><span class="s3">&quot;Failed to load alerts&quot;</span><span class="s2">, </span><span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_SHORT</span><span class="s2">).</span><span class="s1">show</span><span class="s2">();</span>
            <span class="s2">}</span>
        <span class="s2">});</span>
    <span class="s2">}</span>

    <span class="s0">private void </span><span class="s1">editAlert</span><span class="s2">(</span><span class="s1">AlertModel alert</span><span class="s2">) {</span>
        <span class="s1">AlertDialog</span><span class="s2">.</span><span class="s1">Builder builder </span><span class="s2">= </span><span class="s0">new </span><span class="s1">AlertDialog</span><span class="s2">.</span><span class="s1">Builder</span><span class="s2">(</span><span class="s0">this</span><span class="s2">);</span>
        <span class="s1">builder</span><span class="s2">.</span><span class="s1">setTitle</span><span class="s2">(</span><span class="s3">&quot;Edit Alert&quot;</span><span class="s2">);</span>

        <span class="s1">EditText inputType </span><span class="s2">= </span><span class="s0">new </span><span class="s1">EditText</span><span class="s2">(</span><span class="s0">this</span><span class="s2">);</span>
        <span class="s1">inputType</span><span class="s2">.</span><span class="s1">setInputType</span><span class="s2">(</span><span class="s1">InputType</span><span class="s2">.</span><span class="s1">TYPE_CLASS_TEXT</span><span class="s2">);</span>
        <span class="s1">inputType</span><span class="s2">.</span><span class="s1">setHint</span><span class="s2">(</span><span class="s3">&quot;Type&quot;</span><span class="s2">);</span>
        <span class="s1">inputType</span><span class="s2">.</span><span class="s1">setText</span><span class="s2">(</span><span class="s1">alert</span><span class="s2">.</span><span class="s1">getType</span><span class="s2">());</span>

        <span class="s1">EditText inputMessage </span><span class="s2">= </span><span class="s0">new </span><span class="s1">EditText</span><span class="s2">(</span><span class="s0">this</span><span class="s2">);</span>
        <span class="s1">inputMessage</span><span class="s2">.</span><span class="s1">setInputType</span><span class="s2">(</span><span class="s1">InputType</span><span class="s2">.</span><span class="s1">TYPE_CLASS_TEXT</span><span class="s2">);</span>
        <span class="s1">inputMessage</span><span class="s2">.</span><span class="s1">setHint</span><span class="s2">(</span><span class="s3">&quot;Message&quot;</span><span class="s2">);</span>
        <span class="s1">inputMessage</span><span class="s2">.</span><span class="s1">setText</span><span class="s2">(</span><span class="s1">alert</span><span class="s2">.</span><span class="s1">getMessage</span><span class="s2">());</span>

        <span class="s1">android</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">LinearLayout layout </span><span class="s2">= </span><span class="s0">new </span><span class="s1">android</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">LinearLayout</span><span class="s2">(</span><span class="s0">this</span><span class="s2">);</span>
        <span class="s1">layout</span><span class="s2">.</span><span class="s1">setOrientation</span><span class="s2">(</span><span class="s1">android</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">LinearLayout</span><span class="s2">.</span><span class="s1">VERTICAL</span><span class="s2">);</span>
        <span class="s1">layout</span><span class="s2">.</span><span class="s1">addView</span><span class="s2">(</span><span class="s1">inputType</span><span class="s2">);</span>
        <span class="s1">layout</span><span class="s2">.</span><span class="s1">addView</span><span class="s2">(</span><span class="s1">inputMessage</span><span class="s2">);</span>
        <span class="s1">builder</span><span class="s2">.</span><span class="s1">setView</span><span class="s2">(</span><span class="s1">layout</span><span class="s2">);</span>

        <span class="s1">builder</span><span class="s2">.</span><span class="s1">setPositiveButton</span><span class="s2">(</span><span class="s3">&quot;Update&quot;</span><span class="s2">, (</span><span class="s1">dialog</span><span class="s2">, </span><span class="s1">which</span><span class="s2">) </span><span class="s1">-&gt; </span><span class="s2">{</span>
            <span class="s1">alert</span><span class="s2">.</span><span class="s1">setType</span><span class="s2">(</span><span class="s1">inputType</span><span class="s2">.</span><span class="s1">getText</span><span class="s2">().</span><span class="s1">toString</span><span class="s2">().</span><span class="s1">trim</span><span class="s2">());</span>
            <span class="s1">alert</span><span class="s2">.</span><span class="s1">setMessage</span><span class="s2">(</span><span class="s1">inputMessage</span><span class="s2">.</span><span class="s1">getText</span><span class="s2">().</span><span class="s1">toString</span><span class="s2">().</span><span class="s1">trim</span><span class="s2">());</span>
            <span class="s1">alertsRef</span><span class="s2">.</span><span class="s1">child</span><span class="s2">(</span><span class="s1">alert</span><span class="s2">.</span><span class="s1">getId</span><span class="s2">()).</span><span class="s1">setValue</span><span class="s2">(</span><span class="s1">alert</span><span class="s2">)</span>
                    <span class="s2">.</span><span class="s1">addOnSuccessListener</span><span class="s2">(</span><span class="s1">unused -&gt;</span>
                            <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s0">this</span><span class="s2">, </span><span class="s3">&quot;Alert Updated&quot;</span><span class="s2">, </span><span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_SHORT</span><span class="s2">).</span><span class="s1">show</span><span class="s2">())</span>
                    <span class="s2">.</span><span class="s1">addOnFailureListener</span><span class="s2">(</span><span class="s1">e -&gt;</span>
                            <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s0">this</span><span class="s2">, </span><span class="s3">&quot;Update Failed&quot;</span><span class="s2">, </span><span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_SHORT</span><span class="s2">).</span><span class="s1">show</span><span class="s2">());</span>
        <span class="s2">});</span>

        <span class="s1">builder</span><span class="s2">.</span><span class="s1">setNegativeButton</span><span class="s2">(</span><span class="s3">&quot;Cancel&quot;</span><span class="s2">, (</span><span class="s1">dialog</span><span class="s2">, </span><span class="s1">which</span><span class="s2">) </span><span class="s1">-&gt; dialog</span><span class="s2">.</span><span class="s1">dismiss</span><span class="s2">());</span>
        <span class="s1">builder</span><span class="s2">.</span><span class="s1">show</span><span class="s2">();</span>
    <span class="s2">}</span>
<span class="s2">}</span>
</pre>
</body>
</html>
<html>
<head>
<title>SettingsActivity.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cf8e6d;}
.s1 { color: #bcbec4;}
.s2 { color: #bcbec4;}
.s3 { color: #7a7e85;}
.s4 { color: #6aab73;}
</style>
</head>
<body bgcolor="#1e1f22">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
SettingsActivity.java</font>
</center></td></tr></table>
<pre><span class="s0">package </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">content</span><span class="s2">.</span><span class="s1">SharedPreferences</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">os</span><span class="s2">.</span><span class="s1">Bundle</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">Switch</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">appcompat</span><span class="s2">.</span><span class="s1">app</span><span class="s2">.</span><span class="s1">AppCompatActivity</span><span class="s2">;</span>

<span class="s0">public class </span><span class="s1">SettingsActivity </span><span class="s0">extends </span><span class="s1">AppCompatActivity </span><span class="s2">{</span>

    <span class="s0">private </span><span class="s1">Switch flashSwitch</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">Switch vibrationSwitch</span><span class="s2">;</span>

    <span class="s1">@Override</span>
    <span class="s0">protected void </span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">Bundle savedInstanceState</span><span class="s2">) {</span>
        <span class="s0">super</span><span class="s2">.</span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">savedInstanceState</span><span class="s2">);</span>
        <span class="s1">setContentView</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">layout</span><span class="s2">.</span><span class="s1">activity_settings</span><span class="s2">);</span>

        <span class="s3">// Initialize switches</span>
        <span class="s1">flashSwitch </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">switch_flash</span><span class="s2">);</span>
        <span class="s1">vibrationSwitch </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">switch_vibration</span><span class="s2">);</span>

        <span class="s3">// Load saved preferences</span>
        <span class="s1">SharedPreferences preferences </span><span class="s2">= </span><span class="s1">getSharedPreferences</span><span class="s2">(</span><span class="s4">&quot;AlertPrefs&quot;</span><span class="s2">, </span><span class="s1">MODE_PRIVATE</span><span class="s2">);</span>
        <span class="s0">boolean </span><span class="s1">useFlash </span><span class="s2">= </span><span class="s1">preferences</span><span class="s2">.</span><span class="s1">getBoolean</span><span class="s2">(</span><span class="s4">&quot;useFlash&quot;</span><span class="s2">, </span><span class="s0">true</span><span class="s2">);</span>
        <span class="s0">boolean </span><span class="s1">useVibration </span><span class="s2">= </span><span class="s1">preferences</span><span class="s2">.</span><span class="s1">getBoolean</span><span class="s2">(</span><span class="s4">&quot;useVibration&quot;</span><span class="s2">, </span><span class="s0">true</span><span class="s2">);</span>

        <span class="s1">flashSwitch</span><span class="s2">.</span><span class="s1">setChecked</span><span class="s2">(</span><span class="s1">useFlash</span><span class="s2">);</span>
        <span class="s1">vibrationSwitch</span><span class="s2">.</span><span class="s1">setChecked</span><span class="s2">(</span><span class="s1">useVibration</span><span class="s2">);</span>

        <span class="s3">// Save new settings when toggled</span>
        <span class="s1">flashSwitch</span><span class="s2">.</span><span class="s1">setOnCheckedChangeListener</span><span class="s2">((</span><span class="s1">buttonView</span><span class="s2">, </span><span class="s1">isChecked</span><span class="s2">) </span><span class="s1">-&gt; </span><span class="s2">{</span>
            <span class="s1">SharedPreferences</span><span class="s2">.</span><span class="s1">Editor editor </span><span class="s2">= </span><span class="s1">preferences</span><span class="s2">.</span><span class="s1">edit</span><span class="s2">();</span>
            <span class="s1">editor</span><span class="s2">.</span><span class="s1">putBoolean</span><span class="s2">(</span><span class="s4">&quot;useFlash&quot;</span><span class="s2">, </span><span class="s1">isChecked</span><span class="s2">);</span>
            <span class="s1">editor</span><span class="s2">.</span><span class="s1">apply</span><span class="s2">();</span>
        <span class="s2">});</span>

        <span class="s1">vibrationSwitch</span><span class="s2">.</span><span class="s1">setOnCheckedChangeListener</span><span class="s2">((</span><span class="s1">buttonView</span><span class="s2">, </span><span class="s1">isChecked</span><span class="s2">) </span><span class="s1">-&gt; </span><span class="s2">{</span>
            <span class="s1">SharedPreferences</span><span class="s2">.</span><span class="s1">Editor editor </span><span class="s2">= </span><span class="s1">preferences</span><span class="s2">.</span><span class="s1">edit</span><span class="s2">();</span>
            <span class="s1">editor</span><span class="s2">.</span><span class="s1">putBoolean</span><span class="s2">(</span><span class="s4">&quot;useVibration&quot;</span><span class="s2">, </span><span class="s1">isChecked</span><span class="s2">);</span>
            <span class="s1">editor</span><span class="s2">.</span><span class="s1">apply</span><span class="s2">();</span>
        <span class="s2">});</span>
    <span class="s2">}</span>
<span class="s2">}</span>
</pre>
</body>
</html>
<html>
<head>
<title>AlertActionActivity.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cf8e6d;}
.s1 { color: #bcbec4;}
.s2 { color: #bcbec4;}
.s3 { color: #6aab73;}
.s4 { color: #7a7e85;}
.s5 { color: #2aacb8;}
</style>
</head>
<body bgcolor="#1e1f22">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
AlertActionActivity.java</font>
</center></td></tr></table>
<pre><span class="s0">package </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">app</span><span class="s2">.</span><span class="s1">NotificationChannel</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">app</span><span class="s2">.</span><span class="s1">NotificationManager</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">content</span><span class="s2">.</span><span class="s1">SharedPreferences</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">graphics</span><span class="s2">.</span><span class="s1">Color</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">os</span><span class="s2">.</span><span class="s1">Build</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">os</span><span class="s2">.</span><span class="s1">Bundle</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">annotation</span><span class="s2">.</span><span class="s1">Nullable</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">appcompat</span><span class="s2">.</span><span class="s1">app</span><span class="s2">.</span><span class="s1">AppCompatActivity</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">core</span><span class="s2">.</span><span class="s1">app</span><span class="s2">.</span><span class="s1">NotificationCompat</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">core</span><span class="s2">.</span><span class="s1">app</span><span class="s2">.</span><span class="s1">NotificationManagerCompat</span><span class="s2">;</span>

<span class="s0">public class </span><span class="s1">AlertActionActivity </span><span class="s0">extends </span><span class="s1">AppCompatActivity </span><span class="s2">{</span>

    <span class="s0">private static final </span><span class="s1">String CHANNEL_ID </span><span class="s2">= </span><span class="s3">&quot;alertChannel&quot;</span><span class="s2">;</span>

    <span class="s1">@Override</span>
    <span class="s0">protected void </span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">@Nullable Bundle savedInstanceState</span><span class="s2">) {</span>
        <span class="s0">super</span><span class="s2">.</span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">savedInstanceState</span><span class="s2">);</span>
        <span class="s1">setContentView</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">layout</span><span class="s2">.</span><span class="s1">activity_alert_action</span><span class="s2">); </span><span class="s4">// Ensure this layout exists</span>

        <span class="s1">createNotificationChannel</span><span class="s2">();</span>
        <span class="s1">triggerAlertNotification</span><span class="s2">();</span>
    <span class="s2">}</span>

    <span class="s0">private void </span><span class="s1">createNotificationChannel</span><span class="s2">() {</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">Build</span><span class="s2">.</span><span class="s1">VERSION</span><span class="s2">.</span><span class="s1">SDK_INT </span><span class="s2">&gt;= </span><span class="s1">Build</span><span class="s2">.</span><span class="s1">VERSION_CODES</span><span class="s2">.</span><span class="s1">O</span><span class="s2">) {</span>
            <span class="s1">CharSequence name </span><span class="s2">= </span><span class="s3">&quot;Alert Channel&quot;</span><span class="s2">;</span>
            <span class="s1">String description </span><span class="s2">= </span><span class="s3">&quot;Channel for emergency alerts&quot;</span><span class="s2">;</span>
            <span class="s0">int </span><span class="s1">importance </span><span class="s2">= </span><span class="s1">NotificationManager</span><span class="s2">.</span><span class="s1">IMPORTANCE_HIGH</span><span class="s2">;</span>

            <span class="s1">NotificationChannel channel </span><span class="s2">= </span><span class="s0">new </span><span class="s1">NotificationChannel</span><span class="s2">(</span><span class="s1">CHANNEL_ID</span><span class="s2">, </span><span class="s1">name</span><span class="s2">, </span><span class="s1">importance</span><span class="s2">);</span>
            <span class="s1">channel</span><span class="s2">.</span><span class="s1">setDescription</span><span class="s2">(</span><span class="s1">description</span><span class="s2">);</span>
            <span class="s1">channel</span><span class="s2">.</span><span class="s1">enableLights</span><span class="s2">(</span><span class="s0">true</span><span class="s2">);</span>
            <span class="s1">channel</span><span class="s2">.</span><span class="s1">setLightColor</span><span class="s2">(</span><span class="s1">Color</span><span class="s2">.</span><span class="s1">RED</span><span class="s2">);</span>
            <span class="s1">channel</span><span class="s2">.</span><span class="s1">enableVibration</span><span class="s2">(</span><span class="s0">true</span><span class="s2">);</span>

            <span class="s1">NotificationManager notificationManager </span><span class="s2">= </span><span class="s1">getSystemService</span><span class="s2">(</span><span class="s1">NotificationManager</span><span class="s2">.</span><span class="s0">class</span><span class="s2">);</span>
            <span class="s0">if </span><span class="s2">(</span><span class="s1">notificationManager </span><span class="s2">!= </span><span class="s0">null</span><span class="s2">) {</span>
                <span class="s1">notificationManager</span><span class="s2">.</span><span class="s1">createNotificationChannel</span><span class="s2">(</span><span class="s1">channel</span><span class="s2">);</span>
            <span class="s2">}</span>
        <span class="s2">}</span>
    <span class="s2">}</span>

    <span class="s0">private void </span><span class="s1">triggerAlertNotification</span><span class="s2">() {</span>
        <span class="s1">SharedPreferences prefs </span><span class="s2">= </span><span class="s1">getSharedPreferences</span><span class="s2">(</span><span class="s3">&quot;AlertPrefs&quot;</span><span class="s2">, </span><span class="s1">MODE_PRIVATE</span><span class="s2">);</span>
        <span class="s0">boolean </span><span class="s1">useVibration </span><span class="s2">= </span><span class="s1">prefs</span><span class="s2">.</span><span class="s1">getBoolean</span><span class="s2">(</span><span class="s3">&quot;useVibration&quot;</span><span class="s2">, </span><span class="s0">true</span><span class="s2">);</span>
        <span class="s0">boolean </span><span class="s1">useFlash </span><span class="s2">= </span><span class="s1">prefs</span><span class="s2">.</span><span class="s1">getBoolean</span><span class="s2">(</span><span class="s3">&quot;useFlash&quot;</span><span class="s2">, </span><span class="s0">true</span><span class="s2">);</span>

        <span class="s1">NotificationCompat</span><span class="s2">.</span><span class="s1">Builder builder </span><span class="s2">= </span><span class="s0">new </span><span class="s1">NotificationCompat</span><span class="s2">.</span><span class="s1">Builder</span><span class="s2">(</span><span class="s0">this</span><span class="s2">, </span><span class="s1">CHANNEL_ID</span><span class="s2">)</span>
                <span class="s2">.</span><span class="s1">setSmallIcon</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">drawable</span><span class="s2">.</span><span class="s1">ic_launcher_foreground</span><span class="s2">) </span><span class="s4">// Replace with your app icon</span>
                <span class="s2">.</span><span class="s1">setContentTitle</span><span class="s2">(</span><span class="s3">&quot;🚨 Alert Triggered&quot;</span><span class="s2">)</span>
                <span class="s2">.</span><span class="s1">setContentText</span><span class="s2">(</span><span class="s3">&quot;Motion or emergency event detected.&quot;</span><span class="s2">)</span>
                <span class="s2">.</span><span class="s1">setPriority</span><span class="s2">(</span><span class="s1">NotificationCompat</span><span class="s2">.</span><span class="s1">PRIORITY_HIGH</span><span class="s2">)</span>
                <span class="s2">.</span><span class="s1">setAutoCancel</span><span class="s2">(</span><span class="s0">true</span><span class="s2">);</span>

        <span class="s0">if </span><span class="s2">(</span><span class="s1">useVibration</span><span class="s2">) {</span>
            <span class="s1">builder</span><span class="s2">.</span><span class="s1">setVibrate</span><span class="s2">(</span><span class="s0">new long</span><span class="s2">[]{</span><span class="s5">0</span><span class="s2">, </span><span class="s5">500</span><span class="s2">, </span><span class="s5">1000</span><span class="s2">});</span>
        <span class="s2">}</span>

        <span class="s0">if </span><span class="s2">(</span><span class="s1">useFlash</span><span class="s2">) {</span>
            <span class="s1">builder</span><span class="s2">.</span><span class="s1">setLights</span><span class="s2">(</span><span class="s1">Color</span><span class="s2">.</span><span class="s1">RED</span><span class="s2">, </span><span class="s5">1000</span><span class="s2">, </span><span class="s5">1000</span><span class="s2">);</span>
        <span class="s2">}</span>

        <span class="s1">NotificationManagerCompat notificationManager </span><span class="s2">= </span><span class="s1">NotificationManagerCompat</span><span class="s2">.</span><span class="s1">from</span><span class="s2">(</span><span class="s0">this</span><span class="s2">);</span>
        <span class="s1">notificationManager</span><span class="s2">.</span><span class="s1">notify</span><span class="s2">(</span><span class="s5">1</span><span class="s2">, </span><span class="s1">builder</span><span class="s2">.</span><span class="s1">build</span><span class="s2">());</span>
    <span class="s2">}</span>
<span class="s2">}</span>
</pre>
</body>
</html>
<html>
<head>
<title>ClientActivity.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cf8e6d;}
.s1 { color: #bcbec4;}
.s2 { color: #bcbec4;}
.s3 { color: #6aab73;}
.s4 { color: #7a7e85;}
</style>
</head>
<body bgcolor="#1e1f22">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
ClientActivity.java</font>
</center></td></tr></table>
<pre><span class="s0">package </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">os</span><span class="s2">.</span><span class="s1">Bundle</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">Toast</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">annotation</span><span class="s2">.</span><span class="s1">NonNull</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">appcompat</span><span class="s2">.</span><span class="s1">app</span><span class="s2">.</span><span class="s1">AppCompatActivity</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">recyclerview</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">LinearLayoutManager</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">recyclerview</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">RecyclerView</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">.</span><span class="s1">adapter</span><span class="s2">.</span><span class="s1">AlertAdapter</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">.</span><span class="s1">model</span><span class="s2">.</span><span class="s1">AlertModel</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">DataSnapshot</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">DatabaseError</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">DatabaseReference</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">FirebaseDatabase</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">ValueEventListener</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">java</span><span class="s2">.</span><span class="s1">util</span><span class="s2">.</span><span class="s1">ArrayList</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">java</span><span class="s2">.</span><span class="s1">util</span><span class="s2">.</span><span class="s1">List</span><span class="s2">;</span>

<span class="s0">public class </span><span class="s1">ClientActivity </span><span class="s0">extends </span><span class="s1">AppCompatActivity </span><span class="s2">{</span>

    <span class="s0">private </span><span class="s1">RecyclerView recyclerView</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">AlertAdapter adapter</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">List</span><span class="s2">&lt;</span><span class="s1">AlertModel</span><span class="s2">&gt; </span><span class="s1">alertList</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">DatabaseReference alertsRef</span><span class="s2">;</span>

    <span class="s1">@Override</span>
    <span class="s0">protected void </span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">Bundle savedInstanceState</span><span class="s2">) {</span>
        <span class="s0">super</span><span class="s2">.</span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">savedInstanceState</span><span class="s2">);</span>
        <span class="s1">setContentView</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">layout</span><span class="s2">.</span><span class="s1">activity_client</span><span class="s2">);</span>

        <span class="s1">recyclerView </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">recyclerViewAlerts</span><span class="s2">);</span>
        <span class="s1">recyclerView</span><span class="s2">.</span><span class="s1">setLayoutManager</span><span class="s2">(</span><span class="s0">new </span><span class="s1">LinearLayoutManager</span><span class="s2">(</span><span class="s0">this</span><span class="s2">));</span>

        <span class="s1">alertList </span><span class="s2">= </span><span class="s0">new </span><span class="s1">ArrayList</span><span class="s2">&lt;&gt;();</span>
        <span class="s1">alertsRef </span><span class="s2">= </span><span class="s1">FirebaseDatabase</span><span class="s2">.</span><span class="s1">getInstance</span><span class="s2">().</span><span class="s1">getReference</span><span class="s2">(</span><span class="s3">&quot;alerts&quot;</span><span class="s2">);</span>

        <span class="s4">// isAdmin = false for client view</span>
        <span class="s1">adapter </span><span class="s2">= </span><span class="s0">new </span><span class="s1">AlertAdapter</span><span class="s2">(</span><span class="s1">alertList</span><span class="s2">, </span><span class="s1">alertsRef</span><span class="s2">, </span><span class="s0">false</span><span class="s2">);</span>
        <span class="s1">recyclerView</span><span class="s2">.</span><span class="s1">setAdapter</span><span class="s2">(</span><span class="s1">adapter</span><span class="s2">);</span>

        <span class="s1">loadAlerts</span><span class="s2">();</span>
    <span class="s2">}</span>

    <span class="s0">private void </span><span class="s1">loadAlerts</span><span class="s2">() {</span>
        <span class="s1">alertsRef</span><span class="s2">.</span><span class="s1">addValueEventListener</span><span class="s2">(</span><span class="s0">new </span><span class="s1">ValueEventListener</span><span class="s2">() {</span>
            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onDataChange</span><span class="s2">(</span><span class="s1">@NonNull DataSnapshot snapshot</span><span class="s2">) {</span>
                <span class="s1">alertList</span><span class="s2">.</span><span class="s1">clear</span><span class="s2">();</span>
                <span class="s0">for </span><span class="s2">(</span><span class="s1">DataSnapshot snap </span><span class="s2">: </span><span class="s1">snapshot</span><span class="s2">.</span><span class="s1">getChildren</span><span class="s2">()) {</span>
                    <span class="s1">AlertModel model </span><span class="s2">= </span><span class="s1">snap</span><span class="s2">.</span><span class="s1">getValue</span><span class="s2">(</span><span class="s1">AlertModel</span><span class="s2">.</span><span class="s0">class</span><span class="s2">);</span>
                    <span class="s0">if </span><span class="s2">(</span><span class="s1">model </span><span class="s2">!= </span><span class="s0">null</span><span class="s2">) {</span>
                        <span class="s1">alertList</span><span class="s2">.</span><span class="s1">add</span><span class="s2">(</span><span class="s1">model</span><span class="s2">);</span>
                    <span class="s2">}</span>
                <span class="s2">}</span>
                <span class="s1">adapter</span><span class="s2">.</span><span class="s1">notifyDataSetChanged</span><span class="s2">();</span>
            <span class="s2">}</span>

            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onCancelled</span><span class="s2">(</span><span class="s1">@NonNull DatabaseError error</span><span class="s2">) {</span>
                <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s1">ClientActivity</span><span class="s2">.</span><span class="s0">this</span><span class="s2">, </span><span class="s3">&quot;Failed to load alerts&quot;</span><span class="s2">, </span><span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_SHORT</span><span class="s2">).</span><span class="s1">show</span><span class="s2">();</span>
            <span class="s2">}</span>
        <span class="s2">});</span>
    <span class="s2">}</span>
<span class="s2">}</span>
</pre>
</body>
</html>
<html>
<head>
<title>DetailsActivity.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cf8e6d;}
.s1 { color: #bcbec4;}
.s2 { color: #bcbec4;}
.s3 { color: #6aab73;}
.s4 { color: #7a7e85;}
</style>
</head>
<body bgcolor="#1e1f22">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
DetailsActivity.java</font>
</center></td></tr></table>
<pre><span class="s0">package </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">os</span><span class="s2">.</span><span class="s1">Bundle</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">annotation</span><span class="s2">.</span><span class="s1">NonNull</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">appcompat</span><span class="s2">.</span><span class="s1">app</span><span class="s2">.</span><span class="s1">AppCompatActivity</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">recyclerview</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">LinearLayoutManager</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">recyclerview</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">RecyclerView</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">.</span><span class="s1">adapter</span><span class="s2">.</span><span class="s1">AlertAdapter</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">.</span><span class="s1">model</span><span class="s2">.</span><span class="s1">AlertModel</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">DataSnapshot</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">DatabaseError</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">DatabaseReference</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">FirebaseDatabase</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">database</span><span class="s2">.</span><span class="s1">ValueEventListener</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">java</span><span class="s2">.</span><span class="s1">util</span><span class="s2">.</span><span class="s1">ArrayList</span><span class="s2">;</span>

<span class="s0">public class </span><span class="s1">DetailsActivity </span><span class="s0">extends </span><span class="s1">AppCompatActivity </span><span class="s2">{</span>

    <span class="s0">private </span><span class="s1">RecyclerView alertsRecyclerView</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">AlertAdapter alertAdapter</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">ArrayList</span><span class="s2">&lt;</span><span class="s1">AlertModel</span><span class="s2">&gt; </span><span class="s1">alertList</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">DatabaseReference alertsRef</span><span class="s2">;</span>

    <span class="s1">@Override</span>
    <span class="s0">protected void </span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">Bundle savedInstanceState</span><span class="s2">) {</span>
        <span class="s0">super</span><span class="s2">.</span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">savedInstanceState</span><span class="s2">);</span>
        <span class="s1">setContentView</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">layout</span><span class="s2">.</span><span class="s1">activity_detaillayout</span><span class="s2">);</span>

        <span class="s1">alertsRecyclerView </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">alertsRecyclerView</span><span class="s2">);</span>
        <span class="s1">alertsRecyclerView</span><span class="s2">.</span><span class="s1">setLayoutManager</span><span class="s2">(</span><span class="s0">new </span><span class="s1">LinearLayoutManager</span><span class="s2">(</span><span class="s0">this</span><span class="s2">));</span>

        <span class="s1">alertList </span><span class="s2">= </span><span class="s0">new </span><span class="s1">ArrayList</span><span class="s2">&lt;&gt;();</span>
        <span class="s1">alertsRef </span><span class="s2">= </span><span class="s1">FirebaseDatabase</span><span class="s2">.</span><span class="s1">getInstance</span><span class="s2">().</span><span class="s1">getReference</span><span class="s2">(</span><span class="s3">&quot;alerts&quot;</span><span class="s2">);</span>

        <span class="s4">// false because this is for viewing only, not admin</span>
        <span class="s1">alertAdapter </span><span class="s2">= </span><span class="s0">new </span><span class="s1">AlertAdapter</span><span class="s2">(</span><span class="s1">alertList</span><span class="s2">, </span><span class="s1">alertsRef</span><span class="s2">, </span><span class="s0">false</span><span class="s2">);</span>
        <span class="s1">alertsRecyclerView</span><span class="s2">.</span><span class="s1">setAdapter</span><span class="s2">(</span><span class="s1">alertAdapter</span><span class="s2">);</span>

        <span class="s1">loadAlerts</span><span class="s2">();</span>
    <span class="s2">}</span>

    <span class="s0">private void </span><span class="s1">loadAlerts</span><span class="s2">() {</span>
        <span class="s1">alertsRef</span><span class="s2">.</span><span class="s1">addValueEventListener</span><span class="s2">(</span><span class="s0">new </span><span class="s1">ValueEventListener</span><span class="s2">() {</span>
            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onDataChange</span><span class="s2">(</span><span class="s1">@NonNull DataSnapshot snapshot</span><span class="s2">) {</span>
                <span class="s1">alertList</span><span class="s2">.</span><span class="s1">clear</span><span class="s2">();</span>
                <span class="s0">for </span><span class="s2">(</span><span class="s1">DataSnapshot snap </span><span class="s2">: </span><span class="s1">snapshot</span><span class="s2">.</span><span class="s1">getChildren</span><span class="s2">()) {</span>
                    <span class="s1">AlertModel model </span><span class="s2">= </span><span class="s1">snap</span><span class="s2">.</span><span class="s1">getValue</span><span class="s2">(</span><span class="s1">AlertModel</span><span class="s2">.</span><span class="s0">class</span><span class="s2">);</span>
                    <span class="s0">if </span><span class="s2">(</span><span class="s1">model </span><span class="s2">!= </span><span class="s0">null</span><span class="s2">) {</span>
                        <span class="s1">model</span><span class="s2">.</span><span class="s1">setId</span><span class="s2">(</span><span class="s1">snap</span><span class="s2">.</span><span class="s1">getKey</span><span class="s2">()); </span><span class="s4">// set Firebase ID for delete/edit if needed</span>
                        <span class="s1">alertList</span><span class="s2">.</span><span class="s1">add</span><span class="s2">(</span><span class="s1">model</span><span class="s2">);</span>
                    <span class="s2">}</span>
                <span class="s2">}</span>
                <span class="s1">alertAdapter</span><span class="s2">.</span><span class="s1">notifyDataSetChanged</span><span class="s2">();</span>
            <span class="s2">}</span>

            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onCancelled</span><span class="s2">(</span><span class="s1">@NonNull DatabaseError error</span><span class="s2">) {</span>
                <span class="s4">// Optional: log error</span>
            <span class="s2">}</span>
        <span class="s2">});</span>
    <span class="s2">}</span>
<span class="s2">}</span>
</pre>
</body>
</html>
<html>
<head>
<title>HomeActivity.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cf8e6d;}
.s1 { color: #bcbec4;}
.s2 { color: #bcbec4;}
.s3 { color: #7a7e85;}
.s4 { color: #6aab73;}
.s5 { color: #2aacb8;}
</style>
</head>
<body bgcolor="#1e1f22">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
HomeActivity.java</font>
</center></td></tr></table>
<pre><span class="s0">package </span><span class="s1">com</span><span class="s2">.</span><span class="s1">example</span><span class="s2">.</span><span class="s1">smartsense</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">content</span><span class="s2">.</span><span class="s1">Context</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">content</span><span class="s2">.</span><span class="s1">Intent</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">hardware</span><span class="s2">.</span><span class="s1">camera2</span><span class="s2">.</span><span class="s1">CameraManager</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">os</span><span class="s2">.</span><span class="s1">Build</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">os</span><span class="s2">.</span><span class="s1">Bundle</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">os</span><span class="s2">.</span><span class="s1">Handler</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">os</span><span class="s2">.</span><span class="s1">VibrationEffect</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">os</span><span class="s2">.</span><span class="s1">Vibrator</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">Button</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">android</span><span class="s2">.</span><span class="s1">widget</span><span class="s2">.</span><span class="s1">Toast</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">androidx</span><span class="s2">.</span><span class="s1">appcompat</span><span class="s2">.</span><span class="s1">app</span><span class="s2">.</span><span class="s1">AppCompatActivity</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">com</span><span class="s2">.</span><span class="s1">google</span><span class="s2">.</span><span class="s1">firebase</span><span class="s2">.</span><span class="s1">auth</span><span class="s2">.</span><span class="s1">FirebaseAuth</span><span class="s2">;</span>

<span class="s0">public class </span><span class="s1">HomeActivity </span><span class="s0">extends </span><span class="s1">AppCompatActivity </span><span class="s2">{</span>

    <span class="s0">private </span><span class="s1">Button btnAlert</span><span class="s2">, </span><span class="s1">btnSettings</span><span class="s2">, </span><span class="s1">btnReport</span><span class="s2">, </span><span class="s1">btnLogout</span><span class="s2">;</span>
    <span class="s0">private boolean </span><span class="s1">isAdmin </span><span class="s2">= </span><span class="s0">false</span><span class="s2">;</span>

    <span class="s1">@Override</span>
    <span class="s0">protected void </span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">Bundle savedInstanceState</span><span class="s2">) {</span>
        <span class="s0">super</span><span class="s2">.</span><span class="s1">onCreate</span><span class="s2">(</span><span class="s1">savedInstanceState</span><span class="s2">);</span>
        <span class="s1">setContentView</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">layout</span><span class="s2">.</span><span class="s1">activity_home</span><span class="s2">);</span>

        <span class="s1">btnAlert </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">btnAlert</span><span class="s2">);</span>
        <span class="s1">btnSettings </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">btnSettings</span><span class="s2">);</span>
        <span class="s1">btnReport </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">btnReport</span><span class="s2">);</span>
        <span class="s1">btnLogout </span><span class="s2">= </span><span class="s1">findViewById</span><span class="s2">(</span><span class="s1">R</span><span class="s2">.</span><span class="s1">id</span><span class="s2">.</span><span class="s1">btnLogout</span><span class="s2">);</span>

        <span class="s3">// Get role from Intent</span>
        <span class="s1">String role </span><span class="s2">= </span><span class="s1">getIntent</span><span class="s2">().</span><span class="s1">getStringExtra</span><span class="s2">(</span><span class="s4">&quot;role&quot;</span><span class="s2">);</span>
        <span class="s1">isAdmin </span><span class="s2">= </span><span class="s1">role </span><span class="s2">!= </span><span class="s0">null </span><span class="s2">&amp;&amp; </span><span class="s1">role</span><span class="s2">.</span><span class="s1">equalsIgnoreCase</span><span class="s2">(</span><span class="s4">&quot;admin&quot;</span><span class="s2">);</span>

        <span class="s1">btnAlert</span><span class="s2">.</span><span class="s1">setOnClickListener</span><span class="s2">(</span><span class="s1">v -&gt; </span><span class="s2">{</span>
            <span class="s1">triggerFlashAndVibrate</span><span class="s2">();</span>
            <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s1">HomeActivity</span><span class="s2">.</span><span class="s0">this</span><span class="s2">, </span><span class="s4">&quot;Emergency Alert Triggered!&quot;</span><span class="s2">, </span><span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_SHORT</span><span class="s2">).</span><span class="s1">show</span><span class="s2">();</span>
        <span class="s2">});</span>

        <span class="s1">btnSettings</span><span class="s2">.</span><span class="s1">setOnClickListener</span><span class="s2">(</span><span class="s1">v -&gt; </span><span class="s2">{</span>
            <span class="s1">Intent intent </span><span class="s2">= </span><span class="s0">new </span><span class="s1">Intent</span><span class="s2">(</span><span class="s1">HomeActivity</span><span class="s2">.</span><span class="s0">this</span><span class="s2">, </span><span class="s1">SettingsActivity</span><span class="s2">.</span><span class="s0">class</span><span class="s2">);</span>
            <span class="s1">startActivity</span><span class="s2">(</span><span class="s1">intent</span><span class="s2">);</span>
        <span class="s2">});</span>

        <span class="s1">btnReport</span><span class="s2">.</span><span class="s1">setOnClickListener</span><span class="s2">(</span><span class="s1">v -&gt; </span><span class="s2">{</span>
            <span class="s0">if </span><span class="s2">(</span><span class="s1">isAdmin</span><span class="s2">) {</span>
                <span class="s1">startActivity</span><span class="s2">(</span><span class="s0">new </span><span class="s1">Intent</span><span class="s2">(</span><span class="s1">HomeActivity</span><span class="s2">.</span><span class="s0">this</span><span class="s2">, </span><span class="s1">ReportsActivity</span><span class="s2">.</span><span class="s0">class</span><span class="s2">));</span>
            <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
                <span class="s1">Toast</span><span class="s2">.</span><span class="s1">makeText</span><span class="s2">(</span><span class="s0">this</span><span class="s2">, </span><span class="s4">&quot;Access denied: Admins only&quot;</span><span class="s2">, </span><span class="s1">Toast</span><span class="s2">.</span><span class="s1">LENGTH_SHORT</span><span class="s2">).</span><span class="s1">show</span><span class="s2">();</span>
            <span class="s2">}</span>
        <span class="s2">});</span>

        <span class="s1">btnLogout</span><span class="s2">.</span><span class="s1">setOnClickListener</span><span class="s2">(</span><span class="s1">v -&gt; </span><span class="s2">{</span>
            <span class="s1">FirebaseAuth</span><span class="s2">.</span><span class="s1">getInstance</span><span class="s2">().</span><span class="s1">signOut</span><span class="s2">();</span>
            <span class="s1">Intent intent </span><span class="s2">= </span><span class="s0">new </span><span class="s1">Intent</span><span class="s2">(</span><span class="s1">HomeActivity</span><span class="s2">.</span><span class="s0">this</span><span class="s2">, </span><span class="s1">LoginActivity</span><span class="s2">.</span><span class="s0">class</span><span class="s2">);</span>
            <span class="s1">intent</span><span class="s2">.</span><span class="s1">setFlags</span><span class="s2">(</span><span class="s1">Intent</span><span class="s2">.</span><span class="s1">FLAG_ACTIVITY_NEW_TASK </span><span class="s2">| </span><span class="s1">Intent</span><span class="s2">.</span><span class="s1">FLAG_ACTIVITY_CLEAR_TASK</span><span class="s2">);</span>
            <span class="s1">startActivity</span><span class="s2">(</span><span class="s1">intent</span><span class="s2">);</span>
        <span class="s2">});</span>
    <span class="s2">}</span>

    <span class="s0">private void </span><span class="s1">triggerFlashAndVibrate</span><span class="s2">() {</span>
        <span class="s3">// Vibrate</span>
        <span class="s1">Vibrator vibrator </span><span class="s2">= (</span><span class="s1">Vibrator</span><span class="s2">) </span><span class="s1">getSystemService</span><span class="s2">(</span><span class="s1">Context</span><span class="s2">.</span><span class="s1">VIBRATOR_SERVICE</span><span class="s2">);</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">vibrator </span><span class="s2">!= </span><span class="s0">null </span><span class="s2">&amp;&amp; </span><span class="s1">vibrator</span><span class="s2">.</span><span class="s1">hasVibrator</span><span class="s2">()) {</span>
            <span class="s0">if </span><span class="s2">(</span><span class="s1">Build</span><span class="s2">.</span><span class="s1">VERSION</span><span class="s2">.</span><span class="s1">SDK_INT </span><span class="s2">&gt;= </span><span class="s1">Build</span><span class="s2">.</span><span class="s1">VERSION_CODES</span><span class="s2">.</span><span class="s1">O</span><span class="s2">) {</span>
                <span class="s1">vibrator</span><span class="s2">.</span><span class="s1">vibrate</span><span class="s2">(</span><span class="s1">VibrationEffect</span><span class="s2">.</span><span class="s1">createOneShot</span><span class="s2">(</span><span class="s5">500</span><span class="s2">, </span><span class="s1">VibrationEffect</span><span class="s2">.</span><span class="s1">DEFAULT_AMPLITUDE</span><span class="s2">));</span>
            <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
                <span class="s1">vibrator</span><span class="s2">.</span><span class="s1">vibrate</span><span class="s2">(</span><span class="s5">500</span><span class="s2">);</span>
            <span class="s2">}</span>
        <span class="s2">}</span>

        <span class="s3">// Flash</span>
        <span class="s1">CameraManager camManager </span><span class="s2">= (</span><span class="s1">CameraManager</span><span class="s2">) </span><span class="s1">getSystemService</span><span class="s2">(</span><span class="s1">Context</span><span class="s2">.</span><span class="s1">CAMERA_SERVICE</span><span class="s2">);</span>
        <span class="s0">try </span><span class="s2">{</span>
            <span class="s1">String cameraId </span><span class="s2">= </span><span class="s1">camManager</span><span class="s2">.</span><span class="s1">getCameraIdList</span><span class="s2">()[</span><span class="s5">0</span><span class="s2">]; </span><span class="s3">// Usually back camera</span>
            <span class="s1">camManager</span><span class="s2">.</span><span class="s1">setTorchMode</span><span class="s2">(</span><span class="s1">cameraId</span><span class="s2">, </span><span class="s0">true</span><span class="s2">);</span>
            <span class="s0">new </span><span class="s1">Handler</span><span class="s2">().</span><span class="s1">postDelayed</span><span class="s2">(() </span><span class="s1">-&gt; </span><span class="s2">{</span>
                <span class="s0">try </span><span class="s2">{</span>
                    <span class="s1">camManager</span><span class="s2">.</span><span class="s1">setTorchMode</span><span class="s2">(</span><span class="s1">cameraId</span><span class="s2">, </span><span class="s0">false</span><span class="s2">);</span>
                <span class="s2">} </span><span class="s0">catch </span><span class="s2">(</span><span class="s1">Exception e</span><span class="s2">) {</span>
                    <span class="s1">e</span><span class="s2">.</span><span class="s1">printStackTrace</span><span class="s2">();</span>
                <span class="s2">}</span>
            <span class="s2">}, </span><span class="s5">1000</span><span class="s2">); </span><span class="s3">// Flash for 1 second</span>
        <span class="s2">} </span><span class="s0">catch </span><span class="s2">(</span><span class="s1">Exception e</span><span class="s2">) {</span>
            <span class="s1">e</span><span class="s2">.</span><span class="s1">printStackTrace</span><span class="s2">();</span>
        <span class="s2">}</span>
    <span class="s2">}</span>
<span class="s2">}</span>
</pre>
</body>
</html>
<html><head><title>com.example.smartsense</title></head><body><a href="model/index.html"><b>model</b></a><br /><a href="adapter/index.html"><b>adapter</b></a><br /><a href="HomeActivity.java.html">HomeActivity.java</a><br /><a href="AdminActivity.java.html">AdminActivity.java</a><br /><a href="LoginActivity.java.html">LoginActivity.java</a><br /><a href="ClientActivity.java.html">ClientActivity.java</a><br /><a href="DetailsActivity.java.html">DetailsActivity.java</a><br /><a href="ReportsActivity.java.html">ReportsActivity.java</a><br /><a href="RegisterActivity.java.html">RegisterActivity.java</a><br /><a href="SettingsActivity.java.html">SettingsActivity.java</a><br /><a href="AlertActionActivity.java.html">AlertActionActivity.java</a><br /></body></html>
