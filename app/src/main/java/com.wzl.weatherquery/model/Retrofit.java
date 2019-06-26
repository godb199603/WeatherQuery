

OkHttpClient okHttpClient = builder.build();
        mRetrofit = new Retrofit.Builder()
        .baseUrl(ApiStores.API_SERVER_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .client(okHttpClient)
        .build();
        }


