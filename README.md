# Nicehash Java API

A Nicehash API wrapper for Java (and Kotlin).

## Features
- Synchronous API calls
- Asynchronous API calls
- Reactive interface
- Lightweight

## Installation
Still on beta. Watch out for the artifact soon.

## Getting Started
There are 3 client classes that you can use to interface with the API.
1. NicehashApiRestClient - a client for synchronous API calls
2. NicehashApiAsyncRestClient - a client for asynchronous API calls
3. NicehashApiRxClient - a client that wraps APIs as observables

### Creating clients
```java
NicehashApiClientFactory factory = NicehashApiClientFactory.createInstance();
NicehashApiRestClient restClient = factory.createRestClient();
NicehashApiAsyncRestClient asyncClient = factory.createAsyncRestClient();
NicehashApiRxClient rxClient = factory.createRxClient();
```

### Synchronous calls
All results are wrapped in MethodResult. Also, the result contains an error field. You can use this to determine if an error was returned.
```java
MethodResult<Version> versionResult = restClient.getVersion();
if (versionResult.getResult().getError() == null) {
    /* Handle error */
}
```

### Asynchronous calls
An instance of NicehashApiCallback must be passed. All return types are wrapped in MethodResult. Also, the result contains an error field. You can use this to determine if an error was returned.
```java
asyncClient.getVersion(new NicehashApiCallback<MethodResult<Version>>() {
    @Override
    public void onResponse(MethodResult<Version> response) {
        if (response.getResult().getError() == null) {
            /* Handle error */
            return;
        }
        /* Handle success */
    }

    @Override
    public void onFailure(Throwable cause) {
        /* Handle error case */
    }
});
```

### Reactive approach
All results are wrapped in MethodResult. Also, the result contains an error field. You can use this to determine if an error was returned.
```java
rxClient.getVersion().subscribe(new Consumer<MethodResult<Version>>() {
    @Override
    public void accept(MethodResult<Version> versionMethodResult) throws Exception {
        if (versionMethodResult.getResult().getError() == null) {
            /* Handle error */
            return;
        }
        /* Handle success */
    }
});
```

## Endpoints and Return Type
1. getVersion - Version
2. getCurrentGlobalProfitability - GlobalCurrent
3. getAverageGlobalProfitability - GlobalAverage
4. getProviderStatistics - ProviderStat
5. getDetailedProviderStatistics - DetailedProviderStat
6. getPayments - Payment
7. getWorkerDetails - WorkerDetails (Currently disabled)
8. getOrderDetails - OrderDetails
9. getMultiAlgoInfo - MultiAlgoInfo
10. getSimpleMultiAlgoInfo - SimpleMultiAlgoInfo
11. getBuyInfo - BuyInfo

Private APIs are not yet supported. Watch out.
Note: getDetailedProviderStatistics and getWorkerDetails are not parsed well because of weird JSON format. Future version will release a converter to a user friendly object.

## Thanks
Nicehash for the API hosting. https://www.nicehash.com/

Binance Java API for the inspiration. https://github.com/binance-exchange/binance-java-api

## License
MIT License

Copyright (c) 2018 tompee

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
